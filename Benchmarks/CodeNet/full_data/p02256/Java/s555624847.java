import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long numbef = scanner.nextInt();//要素数
		long numaft = scanner.nextInt();//要素数
		
		gcd_euclid(numbef, numaft);
		
		scanner.close();
	}
	
	public static void gcd_euclid(long numbef, long numaft) {
		  long sub;
		  while (0 != numaft) {
		  	//ユークリッドの互除法
		    sub = numbef % numaft; 
		  	numbef = numaft; 
		  	numaft = sub;
		  }
		  System.out.println(numbef);
		}
}


