import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int b = 0, ans = 0;

		for(int i=0; i<t; i++){
			int a = sc.nextInt();
			if(a>k/2) b = a;
		}

		if(b!=0) ans = (b - k/2)*2 - 1;

		System.out.println(ans);
	}
}