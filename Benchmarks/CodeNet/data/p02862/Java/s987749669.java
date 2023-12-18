import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    Map<String, Pos> map = new HashMap<>();
    Queue<Pos> que = new ArrayDeque<>();
    Pos tmp = new Pos(0, 0, 1);
    que.add(tmp);
    map.put("0-0", tmp);

    Pos pos = que.poll();
    while(pos != null){
      //System.out.println(pos);
      if(pos.x + 1 <= x && pos.y + 1 <= y){
        if(pos.x + 2 <= x){
          Pos tmpMapPos = map.get((pos.x + 2) + "-" + (pos.y + 1));
          if(tmpMapPos == null){
            tmpMapPos = new Pos(pos.x + 2, pos.y + 1, pos.count);
            map.put((pos.x + 2) + "-" + (pos.y + 1),tmpMapPos);
            que.add(tmpMapPos);
          } else {
            tmpMapPos.count += pos.count;
          }
        }
        if(pos.y + 2 <= y){
          Pos tmpMapPos = map.get((pos.x + 1) + "-" + (pos.y + 2));
          if(tmpMapPos == null){
            tmpMapPos = new Pos(pos.x + 1, pos.y + 2, pos.count);
            map.put((pos.x + 1) + "-" + (pos.y + 2), tmpMapPos);
            que.add(tmpMapPos);
          } else {
            tmpMapPos.count += pos.count;
          }
        }
      }

      pos = que.poll();
    }

    Pos ans = map.get(x + "-" + y);
    if(ans == null){
      System.out.println(0);
    }else {
      System.out.println(ans.count % 1000000000);
    }
  }


  public static class Pos{
    public int x;
    public int y;
    public long count;
    public Pos(int x, int y,long count){
      this.x = x;
      this.y = y;
      this.count = count;
    }
    public String toString(){
      return x +","+ y +","+ count;
    }
  }
}
