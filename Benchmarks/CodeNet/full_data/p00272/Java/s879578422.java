import java.util.Scanner;
class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int t=sc.nextInt();
			int n=sc.nextInt();
			int S=1;
			int A=2;
			int B=3;
			int C=4;
			int  ans=0;
			if(n==S){
				 ans=6000*t;
			}
			else if(n==A){
				ans=4000*t;
			}else if(n==B){
				ans=3000*t;
			}else  if(n==C){
				ans=t*2000;
			}
			System.out.println(ans);
		}

	}
}