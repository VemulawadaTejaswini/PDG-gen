import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int ans;
	
		while(scan.hasNextInt()){
			n = scan.nextInt();
			
			ans = 0;
			for(int i = 2; i <= n; i++){
				if(isPrime(n))ans++;
			}
			System.out.println(ans);
		}
	}
	
	public static boolean isPrime(int x){
		if(x == 2)return true;
		
		if(x < 2 || x % 2 == 0)return false;
		
		int i = 3;
		while(i <= Math.sqrt(x)){
			if(x / i == 0){
				return true;
			}
			i += 2;
		}
		return true;
	}
}