import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int ans = 0;
		
		if(s%(k*3) == 0) ans = 1;
		else ans = k*3;
        System.out.println(ans);
	}
}