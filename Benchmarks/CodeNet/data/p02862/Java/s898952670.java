import java.util.Scanner;
public class Main {
static long ans=0;
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int X=sc.nextInt();
	int Y=sc.nextInt();
	int m=0;
	int n=0;
	if(!((X+Y)%3==0)) {
		System.out.println(0);
		System.exit(0);
	}else {
		m=(2*X-Y)/3;
		n=X-2*m;
		if(n<0||m<0) {
			System.out.println(0);
			System.exit(0);
		}else {
			ans=1;
			for(int i=0;i<n;i++) {
				ans*=n+m-i;
				ans/=n-i;

			}
		}
		ans%=(Math.pow(10, 9)+7);
		System.out.println(ans);

	}
}
}