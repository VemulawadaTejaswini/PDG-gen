import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		boolean ans = true;
		for(int i = 0; i < n; i++){
			if(a[i] > b[i]){
				ans = false;
			}
		}
		if(ans){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}

}
