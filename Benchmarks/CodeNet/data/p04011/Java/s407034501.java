import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int ans=0;
		for(int i=1;i!=a+1;i++) {
			if(i<=b) {
				ans+=c;
			}
			else {
				ans+=d;
			}
		}
		System.out.println(ans);
	}
	}