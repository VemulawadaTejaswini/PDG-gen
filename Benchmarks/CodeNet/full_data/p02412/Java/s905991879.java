
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		    int count = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0 && x == 0){break;}
			for(int i = 1; i < n ; i++){
				for(int k = i + 1; k < n; k++){
					int l = x - i - k;
					if(l > k){
						if(l <= n){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}

