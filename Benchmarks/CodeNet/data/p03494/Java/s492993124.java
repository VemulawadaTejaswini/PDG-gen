import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int ans = 0;

		int n = Integer.parseInt(scan().next());

		for(int i = 0; i < n; i++){
			int count = 0;
			int youso = Integer.parseInt(scan().next());
			while (0 == (youso % 2)) {
				count++;
			}
			if(ans < count){
				ans = count;
			}
		}

		System.out.println(ans);
	}

	private static Scanner scan() {
		return new Scanner(System.in);
	}

}
