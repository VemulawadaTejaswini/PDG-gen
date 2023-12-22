import java.util.Scanner;

class MathUtil {
	public static void swap(int[] obj, int a, int b) {
		int tmp = obj[a];
		obj[a] = obj[b];
		obj[b] = tmp;
	}
}

class Dice {
	int N=8;
	int ten[] = new int[N+1];

	public Dice(int[] tenkaizu) {
		for(int i=1;i<=N;i++) {
			this.ten[i] = tenkaizu[i-1];
		}
	}

	public int showDice(int number) {
		return ten[number];
	}

	public void printDice() {
	    for(int i=1;i<=N;i++) {
            System.out.print(ten[i] + "\t");
        }
        System.out.println("");
    }

	public void rotate(String meirei) {
		switch (meirei) {
			case "N":
				rotate(1, 2, 6, 5);
				break;
			case "S":
				rotate(5,6, 2, 1);
				break;
			case "E":
				rotate(4, 6, 3, 1);
				break;
			case "W":
				rotate(1, 3, 6, 4);
				break;
		}
	}

	public void rotate(int a, int b, int c, int d) {
		MathUtil.swap(ten, a, b);
		MathUtil.swap(ten, b, c);
		MathUtil.swap(ten, c, d);
	}

	public void rotate(int a, int b, int c) {
		MathUtil.swap(ten, a, b);
		MathUtil.swap(ten, b, c);
	}

	/**
	 * ????????????????????¢??????d?????????
	 * @param d
	 */
	public void topTo(int d) {
		for(int i=0;i<4;i++) {
			rotate("W");
			if(showDice(1) == d) break;
		}
		for(int i=0;i<4;i++) {
			rotate("N");
			if(showDice(1) == d) break;
		}
	}

	public int findRight(int frontD) {
		int[] pos = {4,2,3,5};
		for(int i=0;i<4;i++) {
			if(ten[pos[i]] == frontD) {
				return ten[pos[(i+1)%4]];
			}
		}
		return -1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] men_str = in.nextLine().split(" ");
		int[] men_int = new int[6];
		for (int i = 0; i < 6; i++) {
			men_int[i] = Integer.parseInt(men_str[i]);
		}
		Dice dice = new Dice(men_int);

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int top = in.nextInt();
			int front = in.nextInt();
			dice.topTo(top);
			int ans = dice.findRight(front);
			System.out.println(ans);
		}
	}
}