import java.util.*;

public class Main {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] temp = new int[14];
		int cout = 0;
		int n = sc.nextInt();
		temp[0] = 1;
		for(int i = 1; i <= 6; i++) {
			temp[i] = (int)(Math.pow(9, i));
		}
		for(int i = 1; i <= 7; i++) {
			temp[i + 6] = (int)(Math.pow(6, i));
		}
		int[] list = new int[14];
		Arrays.sort(temp);
		for(int i = 0; i < 14; i++) {
			list[13 - i] = temp[i];
		}
		while(n > 14) {
			for(int i = 0; i < 14; i++) {
				if(n >= list[i]) {
					n -= list[i];
					cout++;
					break;
				}
			}
		}
		if(5 < n && n < 15) {
			System.out.println(cout + n / 6 + n % 6);
		} else {
			System.out.println(cout + n);
		}
	}
}