import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		while(true) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			ans=0;
			if(n==0 && x==0) {
				System.exit(0);
			}
			else{
				for(int i=n; i>=3; i--) {
					for(int j=i-1; j>=2; j--) {
						for(int k=j-1; k>=1; k--) {
							if(i+j+k==x) {
								ans++;
							}
						}
					}
				}
				System.out.println(ans);
			}
		}
	}
}
