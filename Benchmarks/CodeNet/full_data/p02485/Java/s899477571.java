import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			String x = sc.next();
			int sum = 0;
			int value;
			if(x.equals("0")) {
				break;
			}
			for(int i=0; i<x.length(); i++) {
				value = x.charAt(i) - '0';
				sum += value;
			}
			System.out.println(sum);
		}
	}
}