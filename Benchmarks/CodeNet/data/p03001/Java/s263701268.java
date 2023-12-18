import java.util.*;

public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int w = sc.nextInt();
	  int h = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      boolean flg = false;
      if(((w/2.0) == x) && ((h/2.0) == y)) {
        flg = true;
      }
      if(flg) {
        System.out.println((w * h / 2.0) + " 1");
      } else {
        System.out.println((w * h / 2.0) + " 0");
      }      
    
    }
}