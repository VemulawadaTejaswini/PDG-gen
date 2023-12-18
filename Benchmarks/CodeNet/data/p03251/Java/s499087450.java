import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e[]=new int[a];
		int f[]=new int[b];
		for(int i=0;i!=a;i++) {
			e[i]=scan.nextInt();
		}
		for(int i=0;i!=b;i++) {
			f[i]=scan.nextInt();
		}
		int count1=0,count2=0,ans=0;
		for(int i=c+1;i!=d+1;i++) {
			count1=0;count2=0;
			for(int j=0;j!=a+1;j++) {
				if(j==a) {
					count1++;
					break;
				}
				if(i<=e[j]) {
					break;
				}
			}for(int j=0;j!=b+1;j++) {
				if(j==b) {
					count2++;
					break;
				}

				if(i>f[j] ) {
					break;
				}
			}
			if(count1==1&&count2==1) {
				ans++;
				break;
			}
		}
		if(ans==1) {
			System.out.println("No War");
		}
		else {
			System.out.println("War");
		}
	}
}