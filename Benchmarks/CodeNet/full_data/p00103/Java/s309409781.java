import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int inning = 0;
		int attack = 1; // 現在先攻か後攻か
		int out = 0;
		int counter = 0; // カウンタ
		String data;
		int[] point = { 0, 0 };
		int[] base = { 0, 0, 0 };

		inning = scan.nextInt();
		while (inning > 0) {
			if (attack == 0)
				attack = 1;
			else
				attack = 0;

			data = scan.next();
			switch (data) {
			case "HIT":
				for (int i = 1; i > 0; i--) {
					if (base[i] == 1) {
						base[i] = 0;
						base[i + 1] = 1;
					}
				}
				if (base[2] == 1) {
					base[2] = 0;
					point[attack]++;
				}
				base[0] = 1;
				break;
			case "HOMERUN":
				for (int i = 0; i < 3; i++) {
					if (base[i] == 1) {
						base[i] = 0;
						counter++;
					}
				}
				point[attack] += (counter + 1);
				counter = 0;
				break;
			case "OUT":
				out++;
				if(out==3){
					out=0;
					inning--;
				}
			}

		}
	}
}