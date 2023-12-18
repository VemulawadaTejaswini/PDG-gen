import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int x = 0, y = 0;
		for(int i=n-1;i>=0;i--){
			if(a[i] == a[i-1]){
				if(x == 0){
					x = a[i];
					i--;
				}else{
					y = a[i];
					System.out.println(x * y);
					return;
				}
			}
		}
		System.out.println(0);
	}

}
