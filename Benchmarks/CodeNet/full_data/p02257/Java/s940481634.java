import java.util.Scanner;
class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] num = new int[input];
		boolean t;
		int count = 0;
		
		for(int i = 0; i < input; i++){
			num[i] = scan.nextInt();
			
			if(isPrime(num[i])) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static boolean isPrime(int x){
		if(x <= 1) return false;
		
		for(int i = 2; i < x - 1; i++){
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}
}