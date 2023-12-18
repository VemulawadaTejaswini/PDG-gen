import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long m=1,ans=0;
		while(m*m<N){
			if(N%m==0&&m!=1)
				ans+=N/m-1;
			m++;
		}
		System.out.println(ans);
	}
}