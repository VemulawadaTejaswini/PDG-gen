import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long sum = 0;
		for (int i = 0; i <= N; i++) {
			if(!func(i,A,B)){
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
	
	public static boolean func(long num,long A,long B){
		long temp = 0;
		do {
			temp += num % 10;
			num/=10;
		} while (num != 0);
		
		if(temp < A || temp > B){
			return true;
		}else{
			return false;
			
		}
		
		
	}

}