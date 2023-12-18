import java.util.*;
import java.util.Arrays;

public class Main{
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long max = 0;
		for(int i=0;i<=n;i++){
			if((long)(Math.floor(a*i/b)-a*(Math.floor(i/b)))>=max){
				max =(long)(Math.floor(a*i/b)-a*(Math.floor(i/b)));
			}

		}
		System.out.println(max);
		

		
		
	}
}









