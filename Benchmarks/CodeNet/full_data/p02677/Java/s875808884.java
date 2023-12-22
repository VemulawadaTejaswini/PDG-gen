import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextInt();
    double b = sc.nextInt();
    double h = sc.nextInt();
    double m = sc.nextInt();
    
    double mAngle = 360 * (m / 60);
    double hAngle = (360 * (h / 12)) + (30 * (m / 60));
    double allAngle = 0;
    if (mAngle <= hAngle) {
      allAngle = hAngle - mAngle;
    } else {
      allAngle = mAngle - hAngle;
    }
    double cosine = Math.cos(Math.toRadians(allAngle));
    
    double area2 = (a * a) + (b * b) - (2 * a * b * cosine);
    double area = Math.sqrt(area2);
    
    System.out.println(area);
    
  }
}