import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		int num = Integer.parseInt(W.split(" ")[0]);
 
		int[] n = new int[num];
		int[] match = new int[num];
 
		for (int i = 0; i < num; i++) {
			n[i] = sc.nextInt();
		}
 
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (n[i] == n[j]) {
					match[i]++;
				}
			}
			match[i]--;
		}
 
		int sum = 0;
		for (int count : match) {
			sum += count;
		}
		sum /= 2;
 
		for (int i = 0; i < num; i++) {
			System.out.println(sum - match[i]);
		}
 
	}
 
}
