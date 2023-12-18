import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n - 1; i++){
			int index = sc.nextInt();
			a[index - 1] = a[index - 1] + 1;
		}
		
		for (int i = 0; i < n; i++){
			System.out.println(a[i]);
		}
	}
}