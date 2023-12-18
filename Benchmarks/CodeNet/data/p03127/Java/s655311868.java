import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] monster = new int[n];
		for(int i = 0; i < n; i ++) {
			monster[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(monster);
		int min = monster[0];
		for(int i = 0; i < n-1; i ++) {
			if(monster[i+1] - monster[i] < min){
				min = monster[i+1] - monster[i];
			}
		}
		int min2 = monster[0];
		for(int i = 0; i < n; i ++) {
			if(monster[i] % min != 0 && monster[i] % min < min2) {
				min2 = monster[i] % min;
			}
		}
		System.out.println(min2);
	}
}