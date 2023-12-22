import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long numbef = scanner.nextInt();//要素数
		long numaft = scanner.nextInt();//要素数
		
		
		insertionSort(numbef, numaft);
		
		scanner.close();
	}

	public static void insertionSort( long numbef, long numaft){
		long subbef = numbef / 2;
		long subaft = numbef / 2;
		long sub = 0;
		long gcd = 1 ; 
		
		//重複しないために
		if( numbef == numaft ){
			System.out.println(numbef);
			return;
		}else if( subaft > subbef ){
			sub = subbef + 1;
		}else{
			sub = subaft + 1;
		}
		
		//最大公約数探し
		for(int i = 1; i <= sub; i ++ ){
			if( numbef % i == 0 && numaft % i == 0){
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}
}
