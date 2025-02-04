import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n,s,max,count;
		
		max=100;
		Scanner sc = new Scanner(System.in);
		
		for(;;){
		
			n = sc.nextInt();
			s = sc.nextInt();
		
			if(n==0&&s==0)break;
			if(s>864) s=864;
			
			count = check(n-1,s,max);
		
			System.out.println(count);
		}
	}

	private static int check(int n, int s,int max) {
		int count = 0;
		
		if(s<max) max=s;
		
		if(n==0 && s==max) 	return 1;
		else if(n==0)		return 0;
		
		for(;max>=0;max--)
			if(s-max <= n*(max-1))			count += check(n-1,s-max,max-1);
		
		
		return count;
	}

}