import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arrI = sc.next().toCharArray();
		char[] arrR = new char[n];
		arrR[0] = 'S';
		arrR[1] = 'S';
		
		for (int i = 2; i < n; i++) {
			if ((arrR[i - 2] == 'S' && arrR[i - 1] == 'S' && arrI[i - 1] == 'o') || 
				(arrR[i - 2] == 'W' && arrR[i - 1] == 'S' && arrI[i - 1] == 'x') ||
				(arrR[i - 2] == 'S' && arrR[i - 1] == 'W' && arrI[i - 1] == 'x') ||
				(arrR[i - 2] == 'W' && arrR[i - 1] == 'W' && arrI[i - 1] == 'o')) {
				arrR[i] = 'S';
			} else {
				arrR[i] = 'W';
			}
		}
		if ((arrI[0] == 'o' && arrR[n - 1] == 'W') || 
			(arrI[0] == 'x' && arrR[n - 1] == 'S') ||
			(arrI[n - 1] == 'x' && arrR[n - 2] == 'S') ||
			(arrI[n - 1] == 'o' && arrR[n - 2] == 'W')) {
			System.out.println(-1);
		} else {
			System.out.println(arrR);
		}
	}
}
