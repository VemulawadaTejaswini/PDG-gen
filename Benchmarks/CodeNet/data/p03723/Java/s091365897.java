
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int a,b,c;
	void solve(){
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a==b && b==c && a%2==0){
			System.out.println(-1);
			return;
		}
		int count=0;
		while(a%2==0 && b%2==0 && c%2==0){
			int tempa=a;
			int tempb=b;
			int tempc=c;
			a=(tempb+tempc)/2;
			b=(tempa+tempc)/2;
			c=(tempa+tempb)/2;
			count++;
		}
		System.out.println(count);
	}
}
