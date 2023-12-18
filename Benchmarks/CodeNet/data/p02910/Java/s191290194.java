import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tapMove = scanner.nextLine().split("");

		String ans = "Yes";
		for (int i = 0; i < tapMove.length; i++) {
			if((i + 1) % 2 == 0) {
				if(tapMove[i].equals("R")) {
					ans = "No";
					break;
				}
			}
			else {
				if(tapMove[i].equals("L")) {
					ans = "No";
					break;
				}
			}
		}
		
		System.out.println(ans);

	}
}
