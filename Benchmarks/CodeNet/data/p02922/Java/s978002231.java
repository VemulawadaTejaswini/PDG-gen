import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		System.out.println(power_socket(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
		scanner.close();
	}
	
	public static int power_socket(int a, int b) {
		int taps = 1;
		while(true) {
			if(a * taps - (taps - 1) >= b) {
				return taps;
			}
			taps++; 
		}
	}

}