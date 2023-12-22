import java.util.Scanner;
class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int count = 0;
			int[] tm = new int[n];
			if(n == 0 || n >= 10000) break;
			for(int i = 0; i < n; i++){
				tm[i] = sc.nextInt();
				if(prime(tm[i])) count++;
			}
			System.out.println(count);
		}

	}
	static boolean prime(int tm){
		for(int i = 2; i < tm; i++){
			if(tm % i == 0){
				return false;
			}
		}
		return true;
	}
}