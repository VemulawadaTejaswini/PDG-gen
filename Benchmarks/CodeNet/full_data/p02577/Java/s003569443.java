import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		String n = sc.next();
		long sum=0;
		for(int i=0;i<n.length();i++){
			sum=sum+Integer.parseInt(String.valueOf(n.charAt(i)));
		}
		
		if(sum%9==0)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}