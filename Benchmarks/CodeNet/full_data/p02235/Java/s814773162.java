import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String[] data = new String[num * 2];
		for(int i = 0; i < num * 2; i++) {
			data[i] = in.next();
			data[i + 1] = in.next();
			i++;
		}
		for(int i = 0; i < data.length; i++) {
			System.out.println(solve(data[i], data[i+1]));
			i++;
		}
	}
	
	public static int solve(String a, String b) {
		int[][] arr = new int[a.length() + 1][b.length() + 1];
		for(int i = 1; i <= a.length(); i++) {
			for(int j = 1; j <= b.length(); j++) {
				if(!a.substring(i-1, i).equals(b.substring(j-1, j))) {
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
				} else {
					arr[i][j] = 1 + arr[i-1][j-1];
				}
			}
		}
		
		return arr[a.length()][b.length()];
	}
	
}
