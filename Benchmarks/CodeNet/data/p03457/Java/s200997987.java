import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int tmpt = 0;
		int tmpa = 0;
		int tmpb = 0;
		int tmpt2 = 0;
		int tmpa2 = 0;
		int tmpb2 = 0;
		int t;
		int a;
		int b;

		for(int i=0;i<N;i++){
			t = scanner.nextInt();
			a = scanner.nextInt();
			b = scanner.nextInt();
			tmpt = t;
			tmpa = a;
			tmpb = b;
			t = t - tmpt2;
			a = a - tmpa2;
			b = b - tmpb2;
			tmpt2 = tmpt;
			tmpa2 = tmpa;
			tmpb2 = tmpb;
			if(Math.abs(a)+Math.abs(b)>t){
				System.out.println("No");
				return;
			}
			if((Math.abs(a)+Math.abs(b))%2!=t%2){
				System.out.println("No");
				return;
			}
		}
      	System.out.println("Yes");
	}
}