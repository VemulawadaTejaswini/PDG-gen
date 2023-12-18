import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int a = sc.nextInt();
		    int b = sc.nextInt();

		    int ans1 = a+b;
		    int ans2 = a-b;
		    int ans3 = a*b;
		    int ans =0;

		    if(ans1>=ans2) {
		    	ans = ans1;
		    }else {
		    	ans = ans2;
		    }
		    if(ans3>=ans) {
		    	ans = ans3;
		    }

		    System.out.println(ans);

		    sc.close();
	}
}
