import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		long N=sc.nextLong();
		long ans_final=0;
		long ans=(int)Math.sqrt(N);
		if(ans*ans==N) ans_final=N;
		else ans_final=ans*ans;

		System.out.println(ans_final);
	} 
}