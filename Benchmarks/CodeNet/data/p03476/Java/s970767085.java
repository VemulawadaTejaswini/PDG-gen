import java.util.*;


class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] l = new int[N];
		int[] h = new int[N];
		
		for(int i = 0 ; i < N ; i++){
			l[i] = sc.nextInt();
			h[i] = sc.nextInt();
			System.out.println(countLike2017(l[i],h[i]));
		}
	}
	
	static boolean isPrime(int num){
		
		boolean result ;
		switch(num){
		case 1:
			result = false;
			break;
		case 2:
			result = true;
			break;
		default:
			result = true;
			for(int i = 2 ; i <= Math.sqrt(num);i++){
				if(num % i == 0 ){
					result = false;
				}
			}
			break;
		}
		return result;
	}
	
	static boolean isLike2017(int num){
		boolean result = false;
		
		if(isPrime(num) || num == 2 ){ //odd prime
			result = isPrime( (num + 1) / 2);
		}
		return result;
	}
	
	static int countLike2017(int low , int high){
		int counter = 0;
		for(int i = low ; i <= high ; i += 2){
			if(isLike2017(i)){
				counter++;
			}
		}
		return counter;
	}
}
		
		
	