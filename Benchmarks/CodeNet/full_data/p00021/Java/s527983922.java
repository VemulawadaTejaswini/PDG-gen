
import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Vector<Double> vec = new Vector<Double>();
    while(sc.hasNextDouble()){
      double x1 = sc.nextDouble();
      double y1 = sc.nextDouble();

      double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();

      double x3 = sc.nextDouble();
      double y3 = sc.nextDouble();

      double x4 = sc.nextDouble();
      double y4 = sc.nextDouble();

      if ( y1 == y2 && y3 == y4 ){
        System.out.println("YES");
        continue;
      }
      if ( x1 == x2 && x3 == x4 ){
        System.out.println("YES");
        continue;
      }
      double coefAB = (Math.max(y1,y2)-Math.min(y1,y2))*(Math.max(x3,x4)-Math.min(x3,x4));
      double coefCD = (Math.max(y3,y4)-Math.min(y3,y4))*(Math.max(x1,x2)-Math.min(x1,x2));
      double e = coefAB - coefCD;
      if ( e == 0 ){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }

    }
  }
}