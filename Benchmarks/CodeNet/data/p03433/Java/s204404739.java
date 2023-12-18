import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		String ans=null;

		if(N%500<=A) ans="Yes";
		else ans="No";

		System.out.println(ans);
	}
}