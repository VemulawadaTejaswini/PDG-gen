
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N,K;
	N=sc.nextInt();
	K=sc.nextInt();
	String S=sc.next();
	if(S.substring(K-1,K).equals("A")) {
		String str1=S.substring(0,K-1);
		String str2=S.substring(K);
		S=str1+"a"+str2;
		
	}else if(S.substring(K-1,K).equals("B")) {
		String str1=S.substring(0,K-1);
		String str2=S.substring(K);
		S=str1+"b"+str2;
		
	}else if(S.substring(K-1,K).equals("C")) {
		String str1=S.substring(0,K-1);
		String str2=S.substring(K);
		S=str1+"c"+str2;
		
	}
	
	System.out.println(S);
	
		
	}
	

	
}