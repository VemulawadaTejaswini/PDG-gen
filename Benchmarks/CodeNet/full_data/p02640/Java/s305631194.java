import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

		String ans = "";
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int t1 = 4 * x + y;
		int t2 = y-2*x;

		if(y/2==x){

                	System.out.println("Yes");
			return;
		}
		if(y/4==x){
			
                	System.out.println("Yes");
			return;
		}


		if(t1%2!=0){
			ans = "No";

                	System.out.println(ans);

			return;
		}
		if(t2%2!=0){
				
			ans = "No";

                	System.out.println(ans);

			return;
		}
		if(t1/2+t2/2 != x){
			
			ans = "No";

                	System.out.println(ans);

			return;
		}
		if(t1*2+4*t2 != y){
			ans = "No";
			System.out.println(ans);
			return;
		}

                System.out.println("Yes");
    }
}
