import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int count = 0;
		int prime_num = 0;
		boolean prime = false;
		
		while( count < num ) {
			prime = isPrime(scanner);
			if( prime ) {
				prime_num ++;
			}
			count ++;
		}

		 System.out.println(prime_num);
		
		scanner.close();
	}

	public static boolean isPrime(Scanner scanner) {
		int  num = scanner.nextInt();//要素数
		
	    if (num == 2) return true;
	    else if (num % 2 == 0) return false; // 偶数はあらかじめ除く
	
	    double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2)
	    {
	        if (num % i == 0)
	        {
	            // 素数ではない
	            return false;
	        }
	    }
	
	    // 素数である
	    return true;
	}
}
