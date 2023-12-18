import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int K=stdIn.nextInt();
		int ans=0;
		if(A>=K)
			System.out.println(K);
		else{
			K-=A;ans+=A;
			K-=B;
			if(K>0)
				ans-=K;
			System.out.println(ans);
		}
	}
}
