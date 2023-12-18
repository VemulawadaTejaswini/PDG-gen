import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		char c[] = scan.nextLine().toCharArray();
		int arr[][] = new int[2][n];
		for(int i = 0;i < n;i ++) {
			arr[1][i] = eval(c[i]);
		}
		for(int i = 1;i < n;i ++) {
			int pre = i % 2;
			int now = (i + 1) % 2;
			for(int j = 0;j < n - i;j ++) {
				arr[now][j] = Math.abs(arr[pre][j] - arr[pre][j + 1]);
			}
		}
		System.out.println(arr[n % 2][0]);
	}
	
	public static int eval(char a) {
		return a - '0';
	}
}
