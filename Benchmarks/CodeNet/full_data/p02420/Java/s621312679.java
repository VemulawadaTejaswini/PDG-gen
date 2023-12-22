import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		while(true){
			char[] cards = s.next().toCharArray();

			if(cards[0] == '-'){
				return;
			}

			char[] temp = new char[cards.length];
			int m = s.nextInt();

			for(int i=1; i<=m; i++){
				int h = s.nextInt();

				for(int j=0; j<cards.length; j++){
					temp[j] = cards[(j+h)%cards.length];
				}

				for(int j=0; j<cards.length; j++){
					cards[j] = temp[j];
				}

			}

			System.out.println(cards);
		}
	}

}