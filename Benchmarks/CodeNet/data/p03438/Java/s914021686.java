import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];

		
		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n ; i++){
			b[i] = sc.nextInt();
		}
		
		int ba = 0;
		int ab = 0;
		for(int i =0 ; i < n ;i++){
			ba += Math.max(0,b[i]-a[i]);
			ab += Math.max(0,a[i]-b[i]);
		}	
		
		System.out.println(ab*2 > ba ?"No":"Yes");
	}
}
