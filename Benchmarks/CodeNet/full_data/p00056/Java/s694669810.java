import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			int ans = 0;
			for(int i = 3; i < 1000000; i+=2 ){
				for(int j = 3; j < 100000; j+=2){
					if((prime(i)&&prime(j)) && i+j==n){
						ans++;
					}
				}
			}

			System.out.println(ans);
		}
	}

	static boolean prime(int n){
		if(n == (2|3|5|7)) return true;
		for(int i = 3; i < 100000; i+=2){
			if(n % i == 0) return false;
		}
		return true;
	}
}