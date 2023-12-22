import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int max = scan.nextInt();
		int ans = 0;
		for(int i=0;i<N-1;i++){
			int c = scan.nextInt();
			ans+=Math.max(0,max-c);
			max=Math.max(c,max);
		}
		System.out.println(ans);
	}
}