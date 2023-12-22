import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
      float x1 = sc.nextFloat();
      float y1 = sc.nextFloat();
      float x2 = sc.nextFloat();
      float y2 = sc.nextFloat();
      float x3 = sc.nextFloat();
      float y3 = sc.nextFloat();
      float a1 = 2*(x2-x1);
      float a2 = 2*(x3-x1);
      float b1 = 2*(y2-y1);
      float b2 = 2*(y3-y1);
      float c1 = x1*x1-x2*x2+y1*y1-y2*y2;
      float c2 = x1*x1-x3*x3+y1*y1-y3*y3;
      float xp = (b1*c2-b2*c1)/(a1*b2-a2*b1);
      float yp = (c1*a2-c2*a1)/(a1*b2-a2*b1);
      double r  = Math.sqrt((xp-x1)*(xp-x1)+(yp-y1)*(yp-y1));
      System.out.println(String.format("%.3f %.3f %.3f", xp, yp, r));
    }
  }  
}