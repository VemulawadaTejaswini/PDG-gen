import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long Q=sc.nextLong();	//0.25l
		long H=sc.nextLong();	//0.50l
		long S=sc.nextLong();	//1.0l
		long D=sc.nextLong();	//2.0l
		long N=sc.nextLong();	//Nlかう
		long ans=0;	//必要な金額

		H=Math.min(H,2*Q);
		S=Math.min(S,2*H);

		if(2*S<=D) ans=N*S;
		else{
			//2L:D円の方がお買い得の場合
			long num_s=0;
			if(N%2==1) num_s++;	//1L購入本数
			long num_d=N/2;
			ans=(int)(num_s*S+num_d*D);
		}

		System.out.println(ans);

	}
}