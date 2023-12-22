import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		while(true) {
			input();
			if((n|x)==0)
				break;
			solve();
		}
	}

	static int n,x;
	private static void input(){
		n=s.nextInt();
		x=s.nextInt();
	}
	private static void solve(){
		long count=0;
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				for(int k=j+1;k<=n;k++) {
					if(i+j+k==x)
						count++;
				}
			}
		}
		System.out.println(count);
	}
}