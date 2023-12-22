import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		while(true){
			char[] cards = s.next().toCharArray();

			if(cards[0] == '-'){
				return;
			}

			char[] ans = new char[cards.length];
			int m = s.nextInt();

			for(int i=1; i<=m; i++){
				int h = s.nextInt();

				for(int j=0; j<cards.length; j++){
					ans[j] = cards[(j+h)%cards.length];
				}

				System.out.println(ans);
			}
		}
	}

}