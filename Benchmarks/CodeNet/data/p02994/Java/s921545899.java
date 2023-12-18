import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int l = sc.nextInt();
		int taste[] = new int[n];
		int minTaste = l + 1;
		for(int i = 0 ; i < n ; i++) {
			taste[i] = l + i;
			if(Math.abs(minTaste) > Math.abs(taste[i])) {
				minTaste = taste[i];
			}
		}
		int sum = Arrays.stream(taste).sum();
		System.out.println(sum - minTaste);
 
		sc.close();
 
	}
 
}