import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long k=sc.nextLong();
      	long a=sc.nextLong();
		long b=sc.nextLong();
      	
		long n=(b/k)*k;
		if(n>=a){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
	}
}