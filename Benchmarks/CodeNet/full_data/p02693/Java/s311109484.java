
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=k;
		
		while(c<=a-k){
			c+=k;
			//System.out.println(c);
		}
		//System.out.println(c);
		if(c+k>b && k!=1)System.out.println("NG");
		else System.out.println("OK");
		

		
	}
	
}
