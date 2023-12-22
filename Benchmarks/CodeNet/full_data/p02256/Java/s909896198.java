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
		long subbef;
		long subaft;
		long sub = 0;
		long gcd = 1 ;
		int count = 1;
		boolean same = false;
		
		while( true ) {
			if( numbef % 100 == 0 ) {
				if( numaft % 100 == 0 ) {
					numbef = numbef / 10;
					numaft = numaft / 10;
				}else {
					break;
				}
				
			}else {
				break;
			}
			count ++;
		}
		subbef = numbef / 2;
		subaft = numbef / 2;
		
		
		//重複しないために
		if( numbef == numaft ){
			gcd = numbef;
			same = true;
		}else if( subaft > subbef ){
			sub = subbef + 1;
		}else{
			sub = subaft + 1;
		}
		
		//最大公約数探し
		if( !same ) {
			for(int i = 1; i <= sub; i ++ ){
				if( numbef % i == 0 ) {
					if( numaft % i == 0){
						gcd = i;
					}
				}
			}
		}
		
		//桁戻し
		if( count > 0 ) {
			while( count > 1 ) {
				gcd = gcd * 10;
				count --;
			}
		}
		
		System.out.println(gcd);
	}
}
