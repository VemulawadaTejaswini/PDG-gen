import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		
		long n=s.nextLong();
		long ans=0;

		for(int i=1;i<=(Math.log(n)/Math.log(2))+1;i++) {
			ans=ans+(long)Math.pow(2, (Math.floor((Math.log(n)/Math.log(2))))+1-i);
			
		}
		System.out.println(ans);
		
	}
}