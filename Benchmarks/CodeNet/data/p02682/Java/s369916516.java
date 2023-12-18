import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();
		
		if(a>=k){
			int n=a-k;
			System.out.println(a-n);
		}
		else if(a+b>=k){
			System.out.println(a);
		}
		else {
			k-=a;
			k-=b;
			System.out.println(a+(k*(-1)));
		}
		
	}
}
