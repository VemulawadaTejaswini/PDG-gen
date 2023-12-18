import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			String I = Integer.toString(i);
			if (-1 < I.indexOf("0") ||
				-1 < I.indexOf("1") || 
				-1 < I.indexOf("2") ||
				-1 < I.indexOf("4") ||
				-1 < I.indexOf("6") ||
				-1 < I.indexOf("8") ||
				-1 < I.indexOf("9") ) continue;
			else if (0 <= I.indexOf("3") &&
				     0 <= I.indexOf("5") && 
				     0 <= I.indexOf("7") ) {
				count++;
			}
		    else continue;
		}
		System.out.println(count);
	}
}