import java.util.*;

public class Main {
	
	public static void main(String[] args) {
      
        // flag
        boolean flag = false;

		// argumentの取得
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
	    //int y = sc.nextInt();
      
        // 総当たり
        for (int i=1; i < 10; i ++) {
          for (int j = 1; j < 10; j++) {
            if ( x == (i * j)) {
              System.out.println("Yes");
              flag = true;
            } else {
              // do nothing
            }
          }
        }
      
        if (flag == false) {
          System.out.println("No");
        }
	} 
}