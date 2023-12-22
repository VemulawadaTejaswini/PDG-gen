import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int w = 0, k = 0;
		
		for(int i = 0; i < 10; i++){
			n = scan.nextInt();
			w += n;
		}
		for(int i = 0; i < 10; i++){
			n = scan.nextInt();
			k += n;
		}
		System.out.println(w + " " + k);
	}
}