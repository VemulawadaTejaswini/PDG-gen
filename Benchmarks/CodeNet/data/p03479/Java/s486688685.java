import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long Y = scan.nextLong();
		int length = 0;
		while(X <Y){
			length++;
			X *=2;
		}
		System.out.println(length);
	}
	
//	public static boolean func(long num,long A,long B){
//		long temp = 0;
//		do {
//			temp += num % 10;
//			num/=10;
//		} while (num != 0);
//		
//		if(temp < A || temp > B){
//			return true;
//		}else{
//			return false;
//			
//		}
//		
//		
//	}

}