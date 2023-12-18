import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b= sc.nextLong();
		long x = sc.nextLong();
		
		long c = 0;
		
		if(b < x){
			
		} else if(a < x){
			if(a == 0) c++;
			a = x;
		}
		
		for(long i=a; i<=b; i++){
			if(i % x == 0){
				c += (b-i) / x + 1;
				break;
			}
		}
		
		System.out.println(c);
		
		
		
		sc.close();
	}
}