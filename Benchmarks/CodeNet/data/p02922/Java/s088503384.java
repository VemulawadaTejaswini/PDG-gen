public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(power_socket(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
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