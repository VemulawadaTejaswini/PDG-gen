import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int r;
		int cards[];

		while (true){
			n = sc.nextInt();
			r = sc.nextInt();
			if (n == 0 && r == 0){
				break;
			}

			cards = new int[n];
			for (int i = 0; i < n; i++){
				cards[i] = n - i;
			}

			for (int i = 0; i < r; i++){
				cut(cards, sc.nextInt(), sc.nextInt());
			}

			System.out.println("" + cards[0]);
		}
	}

	public static void cut(int cards[], int p, int c){
		int save[] = new int[p - 1 + c];

		for (int i = 0; i < save.length; i++){
			save[i] = cards[i];
		}

		for (int i = 0; i < p - 1; i++){
			cards[c + i] = save[i];
		}

		for (int i = 0; i < c; i++){
			cards[i] = save[p - 1 + i];
		}
	}
}