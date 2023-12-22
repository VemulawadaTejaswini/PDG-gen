import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
      	String res = "";
      	
      	//2z +4(x-z) = y;
		int zz = 4*x - y;
      	if(zz == 0) {
         System.out.println("Yes");
        }else{
          double z = zz/2;
          if ((z == Math.floor(z)) && !Double.isInfinite(z) && z>=0) {
          System.out.println("Yes");
          } else {
          System.out.println("No");
    		}
        }
    }
}