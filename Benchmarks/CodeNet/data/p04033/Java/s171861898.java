import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		if(a > 0 && b > 0){
			System.out.println("Positive");
		}else if(a * b <= 0){
			System.out.println("Zero");
		}else{
			long sum = a + b;
			if(sum * -1 % 2 == 1){
				System.out.println("Positive");
			}else{
				System.out.println("Negative");
			}
		}
	}
}