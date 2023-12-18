import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		long N = ob.nextLong();
		long sum = 0;
		
		for(long i = 1; i <= N; i++){
			if((i % 3 != 0) && (i % 5 != 0)){
				sum += i;
				//System.out.println("i: " + i);
				//System.out.println("Sum: " + sum);	
			}
			else{
				continue;
			}
		}
		System.out.println(sum);
	}
}
