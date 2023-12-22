import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x1 = sc.nextFloat();
    float y1 = sc.nextFloat();
    float x2 = sc.nextFloat();
    float y2 = sc.nextFloat();
    float x3 = sc.nextFloat();
    float y3 = sc.nextFloat();
    float xp = sc.nextFloat();
    float yp = sc.nextFloat();
    float a  = (x2-x1)*(y3-y1)-(x3-x1)*(y2-y1);
    float b  = (xp-x1)*(y3-y1)-(x3-x1)*(yp-y1);
    float c  = (x2-x1)*(yp-y1)-(xp-x1)*(y2-y1);
    float s  = b/a;
    float t  = c/a;
    if(s>0 && t>0 && 0<s+t && s+t<1) {
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}