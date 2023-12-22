import java.io.*;
 
class Main {
  public static void main(String[] args) {
    try {
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
 
      String c1Line = br.readLine();
      String c2Line = br.readLine();
 
      String[] c1Array = c1Line.split(" ", 0);
      String[] c2Array = c2Line.split(" ", 0);
 
      int c1x = Integer.parseInt(c1Array[0]);
      int c1y = Integer.parseInt(c1Array[1]);
      int c1r = Integer.parseInt(c1Array[2]);
 
      int c2x = Integer.parseInt(c2Array[0]);
      int c2y = Integer.parseInt(c2Array[1]);
      int c2r = Integer.parseInt(c2Array[2]);
 
      int diffX = Math.abs(c1x - c2x);
      int diffY = Math.abs(c1y - c2y);
      int xyR = c1r + c2r;
      int right1X = c1x + c1r;
      int left1X = c1x - c1r;
      int right2X = c2x + c2r;
      int left2X = c2x - c2r;
 
      int top1Y = c1y + c1r;
      int bottom1Y = c1y - c1r;
      int top2Y = c2y + c2r;
      int bottom2Y = c2y - c2r;
 
      if(c1x == c2x) {
        if(diffY == xyR) { //外接
          System.out.println(3);
        } else if(diffY > xyR) { // 離れ
          System.out.println(4);
        } else {
          if(((top1Y < top2Y) && (bottom1Y > bottom2Y)) ||
          ((top1Y > top2Y) && (bottom1Y < bottom2Y))) { // 内包
            System.out.println(0);
          } else if(((top1Y < top2Y) || (bottom1Y > bottom2Y)) &&
          ((top1Y > top2Y) || (bottom1Y < bottom2Y))) { // 内接
            System.out.println(1);
          } else System.out.println(2); // 交わる
        }
      } else if(c1y == c2y) {
        if(diffX == xyR) { //外接
          System.out.println(3);
        } else if(diffX > xyR) { // 離れ
          System.out.println(4);
        } else {
          if(((right1X < right2X) && (left1X > left2X)) ||
          ((right1X > right2X) && (left1X < left2X))) { // 内包
            System.out.println(0);
          } else if(((right1X <= right2X) || (left1X <= left2X)) &&
          ((right1X >= right2X) || (left1X >= left2X))) { // 内接
            System.out.println(1);
          } else System.out.println(2); // 交わる
        }
      } else if((c1x != c2x) || (c1y != c2y)) {
        double d = Math.sqrt(diffX*diffX + diffY*diffY);
        if(d > xyR) { //離れ
          System.out.println(4);
        } else {
          if((((right1X < right2X) && (left1X > left2X)) && ((top1Y < top2Y) && (bottom1Y > bottom2Y))) ||
          (((right1X > right2X) && (left1X < left2X)) && ((top1Y > top2Y) && (bottom1Y < bottom2Y)))) { // 内包
            System.out.println(0);
          } else if((((right1X <= right2X) || (left1X >= left2X)) && ((top1Y <= top2Y) || (bottom1Y >= bottom2Y))) ||
          (((right1X >= right2X) || (left1X <= left2X)) && ((top1Y >= top2Y) || (bottom1Y <= bottom2Y)))) { // 内接
            System.out.println(1);
          } else System.out.println(2); // 交わる
        }
      }
    } catch(Exception e) {}
  }
}
