import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			int number = Integer.parseInt(sc.nextLine());

			if (number == 0)
				return;
			int a_player = 0;
			int b_player = 0;

			for (int i = 0; i < number; i++){
				String input[] = sc.nextLine().split(" ");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);

				if (a == b){
					a_player += a;
					b_player += b;
				}
				else if (a < b) {
					b_player += a + b;
				}
				else {
					a_player += a + b; 
				}
			}

			System.out.println(a_player + " " + b_player);
		}
	}
}