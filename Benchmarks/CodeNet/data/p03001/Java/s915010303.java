import java.util.*;

public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int w = sc.nextInt();
	  int h = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      double a = (double)w*h;
      boolean flg = false;
      if((w == x*2) && (h == y * 2)) {
        flg = true;
      }
      if(flg) {
        System.out.println((a/ 2.0) + " 1");
      } else {
        System.out.println((a/ 2.0) + " 0");
      }      
    
    }
}