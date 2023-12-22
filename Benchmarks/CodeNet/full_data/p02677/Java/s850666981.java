import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();//1辺目
    int c = sc.nextInt();//2辺目
    int x = sc.nextInt();
    int y = sc.nextInt();
	double xr = 360*(x*60 + y) / 720;
    double yr = 360*y / 60;
    
    double e = Math.max(xr-yr, yr-xr);
 
    double r=Math.sqrt(Math.pow(b,2)+Math.pow(c,2)-2*b*c*Math.cos(Math.toRadians(e)));
 
	System.out.println(r);
  }
 
}