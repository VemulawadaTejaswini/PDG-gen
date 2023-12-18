import java.io.*;
import java.util.*;

public class Main implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void solve() throws IOException {
        final int X = 0;
        final int Y = 1;
        final int Z = 2;
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int[] c = {x, y, z};
        TreeSet<Pos>[][] move = new TreeSet[3][];
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            move[i] = new TreeSet[3];
            for (int j = 0; j < 3; j++) {
                if (i == j) continue;
                final int from = i;
                final int to = j;
                move[i][j] = new TreeSet<>((p1, p2) -> p1.compare(p2, from, to));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < c[i]; j++) {
                Pos p = new Pos(in.nextInt(), in.nextInt(), in.nextInt());
                ans += p.coin[i];
//                System.out.println(i + " <+ " + p.coin[i]);
                for (int k = 0; k < 3; k++) {
                    if (i == k) continue;
                    move[i][k].add(p);
                }
            }
        }
        final int inf = -1;
        while (true) {
            // calc best swap
            int bestPoint = inf;
            int bi = -1;
            int bj = -1;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    Pos p1 = move[i][j].last();
                    Pos p2 = move[j][i].last();
                    int point = p1.getPoint(i, j) + p2.getPoint(j, i);
                    if (point > bestPoint) {
                        bestPoint = point;
                        bi = i;
                        bj = j;
                    }
                }
            }
            // swap
            if (bestPoint <= 0) break;
            ans += bestPoint;
            swap(move, bi, bj);
        }
        System.out.println(ans);
    }

    void swap(TreeSet<Pos>[][] move, int i, int j) {
        Pos p1 = move[i][j].pollLast();
        move[i][3 - (i + j)].remove(p1);
        Pos p2 = move[j][i].pollLast();
        move[j][3 - (i + j)].remove(p2);
//        System.out.printf("swap %s[%d] & %s[%d]\n", p1, i, p2, j);
        move[i][j].add(p2);
        move[i][3 - (i + j)].add(p2);
        move[j][i].add(p1);
        move[j][3 - (i + j)].add(p1);
    }
}

class Pos {
    int[] coin;
    Pos(int x, int y, int z) {
        coin = new int[]{ x, y, z };
    }

    int getPoint(int from, int to) {
        return coin[to] - coin[from];
    }

    int compare(Pos p, int from, int to) {
        return getPoint(from, to) - p.getPoint(from, to);
    }

    @Override
    public String toString() {
        return Arrays.toString(coin);
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}
