import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, x = 0;
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			int result = 0;
			if((n == 0 && x == 0) || n < 3 || n > 100) break;
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= n; j++){
					for(int k = 1; k <= n; k++){
						if(i + j + k == x) result++;
					}
				}
			}
			System.out.println(result);
		}
	}

}