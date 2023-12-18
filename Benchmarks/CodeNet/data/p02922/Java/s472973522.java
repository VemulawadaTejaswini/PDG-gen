import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    long ans = a;
		    int cnt = 1;
		    while(b-ans>0) {
		    	cnt += 1;
		    	ans += a-1;
		    }
		    System.out.println(cnt);


		    sc.close();
	}
}
