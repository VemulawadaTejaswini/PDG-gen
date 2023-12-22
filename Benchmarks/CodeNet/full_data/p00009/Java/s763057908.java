import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static int primeNum(int n){
		int count = 0;
		
		for(int i = 2; i <= n; i ++){
			if(isThisPrime(i)){
				count ++;
			}
		}
		
		return count;
	}
	
	static boolean isThisPrime(int n){
		if(n != 2 | n % 2 == 0){
			for(int i = 2; i < n; i = i + 1){
				if(n % i == 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	
    	while(in.hasNext()){
    		System.out.println(primeNum(in.nextInt()));
    	}
    	
    	in.close();
	}
}