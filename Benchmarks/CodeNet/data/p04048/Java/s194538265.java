import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}

	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		System.out.println(n+func(x,n-x));
	}
	
	int func(int a,int b) {
		if(a<b) {
			return 2*a+func(a,b-a);
		}else if(a>b){
			return 2*b+func(b,a-b);
		}else{
			return a;
		}
	}
}
