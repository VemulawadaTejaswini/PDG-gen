import java.util.*;
import java.util.Scanner;

public class Main{
	static Scanner sc=new Scanner(System.in);
	static int x=sc.nextInt();
	
	public static void main(String[] args) {
	   int ans=0;
	   
		for(long j=1;j<=x;j++) {
			for(long i=x;i>=1;i--){
				if(i%j==0) {
					long n=i/j;
					ans+=((j+i)*n)/2;
					break;
				} 
			}
		}
	    System.out.println(ans);
	}
}
