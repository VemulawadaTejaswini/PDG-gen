import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int hako[] = new int[100];
		int ans=100;
		for(int i=0;i<n;i++) {
			hako[i]=0;
		}
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			hako[a]= 1;
		}
		
		for(int i=0;i<100;i++) {
			if(x<i && Math.abs(i-x)>=Math.abs(ans-x)) {
				break;
			}
			
			if( Math.abs(i-x)<=Math.abs(ans-x) && hako[i]==0 ) {
				ans=i;
			}
		}
		
		System.out.println(ans);
	}
}
