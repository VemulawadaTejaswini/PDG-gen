import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int t;
		int ans = stdIn.nextInt();
		for(int i=1; i<n; i++){
			t = stdIn.nextInt();
			ans = lcd(ans,t);
		}

		System.out.println(ans);

		stdIn.close();
	}

	static int lcd(int a,int b){
		int p = a;
		int q = b;
		int r = a % b;
		while(r != 0){
			p = q;
			q = r;
			r = p % q;
		}
		return a / q * b;
	}
}