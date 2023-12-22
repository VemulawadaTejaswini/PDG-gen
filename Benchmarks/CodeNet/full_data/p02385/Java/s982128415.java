import java.util.*;

public class Main {
  public static int forward = 5;
  public static int back = 2;
  public static int right = 3;
  public static int left = 4;
  public static int up = 1;
  public static int down = 6;

  public static int forward2 = 5;
  public static int back2 = 2;
  public static int right2 = 3;
  public static int left2 = 4;
  public static int up2 = 1;
  public static int down2 = 6;

/*  public static void north() {
    int a = forward;
    forward = up;
    up = back;
    back = down;
    down = a;
  }
  public static void east() {
    int a = right;
    right = up;
    up = left;
    left = down;
    down = a;
  }
  public static void south() {
    int a = back;
    back = up;
    up = forward;
    forward = down;
    down = a;
  }
  public static void west() {
    int a = left;
    left = up;
    up = right;
    right = down;
    down = a;
  }*/
  public static void assign(int a, int b, int c, int d, int e, int f) {
    up = a;
    back = b;
    right = c;
    left = d;
    forward = e;
    down = f;
  }
  public static void assign2(int a, int b, int c, int d, int e, int f) {
    up2 = a;
    back2 = b;
    right2 = c;
    left2 = d;
    forward2 = e;
    down2 = f;
  }
  public static void turnHori() {
    int a = back2;
    back2 = right2;
    right2 = forward2;
    forward2 = left2;
    left2 = a;
  }
  public static void turnVert() {
    int a = up2;
    up2 = right2;
    right2 = down2;
    down2 = left2;
    left2 = a;
  }
  public static boolean identical() {
    if(up == up2 && forward == forward2 && right == right2 && back == back2 &&
      left == left2 && down == down2) {
      return true;
    } else {
      return false;
    }
  }
/*  public static int returnRight(int a, int b) {
    if((a == left && b == back) || (a == forward && b == left) || (a == right && b == forward)
      || (a == back && b == right)) {
      return up;
    } else if((a == up && b == left) || (a == right && b == up) || (a == down && b == right)
      || (a == left && b == down)) {
      return back;
    } else if((a == up && b == back) || (a == forward && b == up) || (a == down && b == forward)
      || (a == back && b == down)) {
      return right;
    } else if((a == up && b == forward) || (a == back && b == up) || (a == down && b == back)
      || (a == forward && b == down)) {
      return left;
    } else if((a == up && b == right) || (a == left && b == up) || (a == down && b == left)
      || (a ==right && b == down)) {
      return forward;
    } else {
      return down;
    }
  }*/
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dice = new int[6];
    int[] dice2 = new int[6];
    for(int i = 0; i < 6; i++) {
      dice[i] = sc.nextInt();
    }
    assign(dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]);
    for(int i = 0; i < 6; i++) {
      dice2[i] = sc.nextInt();
    }
    assign2(dice2[0], dice2[1], dice2[2], dice2[3], dice2[4], dice2[5]);
    boolean isEqual = false;
    if(up == up2) {
      for(int i = 0; i < 4; i++) {
        if(identical()) {
          isEqual = true;
          break;
        } else {
          turnHori();
        }
      }
    }
    assign2(dice2[0], dice2[1], dice2[2], dice2[3], dice2[4], dice2[5]);
    if(up == forward2) {
      turnHori();
      turnVert();
      for(int i = 0; i < 4; i++) {
        if(identical()) {
          isEqual = true;
          break;
        } else {
          turnHori();
        }
      }
    }
    assign2(dice2[0], dice2[1], dice2[2], dice2[3], dice2[4], dice2[5]);
    if(up == right2) {
      turnVert();
      for(int i = 0; i < 4; i++) {
        if(identical()) {
          isEqual = true;
          break;
        } else {
          turnHori();
        }
      }
    }
    assign2(dice2[0], dice2[1], dice2[2], dice2[3], dice2[4], dice2[5]);
    if(up == back2) {
      turnHori();
      turnHori();
      turnHori();
      turnVert();
      for(int i = 0; i < 4; i++) {
        if(identical()) {
          isEqual = true;
          break;
        } else {
          turnHori();
        }
      }
    }
    assign2(dice2[0], dice2[1], dice2[2], dice2[3], dice2[4], dice2[5]);
    if(up == left2) {
      turnVert();
      turnVert();
      turnVert();
      for(int i = 0; i < 4; i++) {
        if(identical()) {
          isEqual = true;
          break;
        } else {
          turnHori();
        }
      }
    }
    assign2(dice2[0], dice2[1], dice2[2], dice2[3], dice2[4], dice2[5]);
    if(up == down2) {
      turnVert();
      turnVert();
      for(int i = 0; i < 4; i++) {
        if(identical()) {
          isEqual = true;
          break;
        } else {
          turnHori();
        }
      }
    }
    if(isEqual) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

