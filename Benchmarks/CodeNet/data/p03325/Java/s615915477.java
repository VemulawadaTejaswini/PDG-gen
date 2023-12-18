import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int cal(int x){
		if(x%2==0) {
			return 1+cal(x/2);
		}else {
			return 0;
		}
	}
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i=0;i<N;i++) {
			ans += cal(a[i]);
		}
		
		out.println(ans);
		
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
