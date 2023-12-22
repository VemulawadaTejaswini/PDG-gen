import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

  final byte ROW       =  4;
  final byte MATRIX    = 16;
  final byte DIRECTION =  4;
  final byte[] dx = { 0,-1, 0, 1};
  final byte[] dy = { 1, 0,-1, 0};
  final String[] dir = {"r","u","l","d"};
  byte MDT[][] = new byte[MATRIX][MATRIX];

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      for(int i=0; i<MATRIX; i++)
        for(int j=0; j<MATRIX; j++)
          MDT[i][j] = (byte)( Math.abs(i / ROW - j / ROW)
                            + Math.abs(i % ROW - j % ROW) );
      Puzzule  first;
      String[] line ;
      byte[] inPuzzle = new byte[MATRIX];
      byte posSpace = 0;

      for(byte i=0; i<MATRIX; ) {
        line = br.readLine().split(" ");
        for(byte j=0; j<ROW; j++, i++) {
          inPuzzle[i] = (byte)Integer.parseInt(line[j]);
          if(inPuzzle[i] == 0) {
            inPuzzle[i] = MATRIX;
            posSpace = i;
          }
        }
      }

      first = new Puzzule(inPuzzle, posSpace);
      // System.out.println(first.md);
      // System.out.println(first.state);
      System.out.println( algorithmAster(first) );
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private byte algorithmAster(Puzzule s) {
    Queue<State> queue = new PriorityQueue<>();
    Set<Puzzule> set = new HashSet<>();
    Puzzule u,v;
    State initial = new State(s, s.md);
    queue.offer(initial);
    set.add(s);

    byte sx,sy,tx,ty;
    while( !queue.isEmpty() ) {
      State st = queue.poll();
      u = st.puzzle;

      if(u.md == 0) {
        // System.out.println(queue.size());
        // System.out.println(set.size());
        // System.out.println(u.state);
        return u.cost;
      }

      sx = (byte)(u.space / ROW);
      sy = (byte)(u.space % ROW);

      for( byte r=0; r<DIRECTION; r++ ) {
        tx = (byte)(sx + dx[r]);
        ty = (byte)(sy + dy[r]);
        if( tx<0 || ty<0 || tx>= ROW || ty>=ROW ) continue;

        v = u.clone();
        v.md -= MDT[ tx*ROW+ty ][ v.mat[tx*ROW+ty]-1 ];
        v.md += MDT[ sx*ROW+sy ][ v.mat[tx*ROW+ty]-1 ];
        v.swap((byte)(sx*ROW+sy), (byte)(tx*ROW+ty));

        if(set.add(v)) {
        // if(!set.contains(v)) {
          v.cost++;
          State news = new State(v, (byte)(v.cost + v.md));
          // State news = new State(v, v.md);
          queue.offer(news);
        }
      }
    }

    return -1;
  }

  class State implements Comparable<State>  {
    Puzzule puzzle;
    byte estimated;
    
    public State() {
      puzzle = new Puzzule();
      estimated = 0;
    }
    public State(Puzzule puzzule, byte estimated) {
      this.puzzle    = puzzule;
      this.estimated = estimated; 
    }
    @Override
    public int compareTo(State ref) {
      return this.estimated - ref.estimated;
    }
  }

  class Puzzule implements Cloneable {

    byte[] mat;
    byte   space;
    byte   md,cost;
    String  path;
    String  state;

    public Puzzule() {
      mat = null;
      space = md = cost = 0;
      // path  = "";
      // state = "";
    }
    public Puzzule(byte[] mat, byte space) {
      this.mat = mat;
      this.space = space;
      cost = 0;
      // path = "";
      calcAllMD();
      // updateState();
    }

    @Override
    public boolean equals(Object obj) {
      if(obj == this) return true;
      if(obj == null) return false;
      if(!(obj instanceof Puzzule)) return false;

      Puzzule ref = (Puzzule)obj;

      for(byte i=0; i<MATRIX; i++)
        if(this.mat[i]!=ref.mat[i]) return false;

      return true;
    }
    @Override
    public int hashCode() {
      // int result = 31;

      // return result * 17 + state.hashCode();
      return this.toString().hashCode();
    }
    @Override
    public Puzzule clone() {
      try {
        Puzzule ret = (Puzzule)super.clone();
        ret.mat   = this.mat.clone();
        return ret;
      } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
      }
    }

    public boolean isTarget() {
      for(byte i=0; i<MATRIX; i++)
        if(mat[i]!=(i+1)) return false;

      return true;
    }
    public void swap(byte a, byte b) {
      byte t = mat[a]; mat[a] = mat[b]; mat[b] = t;
      space = b;
      // updateState();
    }
    public void updateState() {
      StringBuilder buf = new StringBuilder(48);
      for (byte var : mat) {
        buf.append(var).append(" ");
      }
      buf.setLength(buf.length()-1);

      state = buf.toString();
    }
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(48);
      for (byte var : mat) {
        buf.append(var).append(" ");
      }
      buf.setLength(buf.length()-1);

      return buf.toString();
    }
    public void calcAllMD() {
      md = 0;
      for(byte i=0; i<MATRIX; i++) {
        if(mat[i] == MATRIX) continue;
        md += MDT[i][mat[i]-1];
      }
    }
  }
}
