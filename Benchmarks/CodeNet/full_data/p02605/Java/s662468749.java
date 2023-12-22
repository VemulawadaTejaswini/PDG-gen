import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Airplane> airplanes = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      char u = sc.next().charAt(0);
      airplanes.add(new Airplane(x, y, u));
    }
    int mintime = Integer.MAX_VALUE;

    //X座標でソートして、上下にぶつかる飛行機をさがす
    Collections.sort(airplanes, (a1, a2) -> {
      if (a1.x != a2.x) {
        return Integer.compare(a1.x, a2.x);
      }
      return Integer.compare(a1.y, a2.y);
    });
    Airplane temp = airplanes.get(0);
    for(int i = 1; i < n; i++){
      Airplane cur = airplanes.get(i);
      if(cur.x != temp.x){
        temp = cur;
        continue;
      }
      if(cur.direction == 'U'){
        temp = cur;
      } else if(cur.direction == 'D'){
        mintime = Math.min(mintime, (cur.y - temp.y) * 5);
      }
    }
    //Y座標でソートして、左右にぶつかる飛行機をさがす
    Collections.sort(airplanes, (a1, a2) -> {
      if (a1.y != a2.y) {
        return Integer.compare(a1.y, a2.y);
      }
      return Integer.compare(a1.x, a2.x);
    });
    temp = airplanes.get(0);
    for(int i = 1; i < n; i++){
      Airplane cur = airplanes.get(i);
      if(cur.y != temp.y){
        temp = cur;
        continue;
      }
      if(cur.direction == 'R'){
        temp = cur;
      } else if(cur.direction == 'L'){
        mintime = Math.min(mintime, (cur.x - temp.x) * 5);
      }
    }
    //X＋Yの合計でソートして、90度突入でぶつかる飛行機をさがす
    Collections.sort(airplanes, (a1, a2) -> {
      if (a1.x + a1.y != a2.x + a2.y) {
        return Integer.compare(a1.x + a1.y, a2.x + a2.y);
      }
      return Integer.compare(a1.x, a2.x);
    });

    Airplane tempU = null;
    Airplane tempD = null;
    Airplane tempL = null;
    Airplane tempR = null;

    temp = airplanes.get(0);
    tempD = temp.direction == 'D' ? temp : null;
    tempR = temp.direction == 'R' ? temp : null;
    for(int i = 1; i < n; i++){
      Airplane cur = airplanes.get(i);
      if(cur.x + cur.y != temp.x + temp.y){
        temp = cur;
        tempD = temp.direction == 'D' ? temp : null;
        tempR = temp.direction == 'R' ? temp : null;
        continue;
      }
      if(cur.direction == 'D'){
        tempD = cur;
      } else if(cur.direction == 'R'){
        tempR = cur;
      } else if(cur.direction == 'U' && tempR != null){
        mintime = Math.min(mintime, (cur.x - tempR.x) * 10);
      } else if(cur.direction == 'L' && tempD != null){
        mintime = Math.min(mintime, (cur.x - tempD.x) * 10);
      }
    }

    //X-Yの合計でソートして、90度突入でぶつかる飛行機をさがす
    Collections.sort(airplanes, (a1, a2) -> {
      if (a1.x - a1.y != a2.x - a2.y) {
        return Integer.compare(a1.x - a1.y, a2.x - a2.y);
      }
      return Integer.compare(a1.x, a2.x);
    });
    temp = airplanes.get(0);
    tempU = temp.direction == 'U' ? temp : null;
    tempR = temp.direction == 'R' ? temp : null;
    for(int i = 1; i < n; i++){
      Airplane cur = airplanes.get(i);
      if(cur.x - cur.y != temp.x - temp.y){
        temp = cur;
        tempU = temp.direction == 'U' ? temp : null;
        tempR = temp.direction == 'R' ? temp : null;
        continue;
      }
      if(cur.direction == 'U'){
        tempU = cur;
      } else if(cur.direction == 'R'){
        tempR = cur;
      } else if(cur.direction == 'D' && tempR != null){
        mintime = Math.min(mintime, (cur.x - tempR.x) * 10);
      } else if(cur.direction == 'L' && tempU != null){
        mintime = Math.min(mintime, (cur.x - tempU.x) * 10);
      }
    }
    System.out.println(mintime == Integer.MAX_VALUE ? "SAFE" : mintime);
  }

  static class Airplane {
    public Airplane(int x, int y, char direction) {
      this.x = x;
      this.y = y;
      this.direction = direction;
    }

    int x, y;
    char direction;
  }
}
