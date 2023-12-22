import java.util.Scanner;

class Dice {

	// ?????¨??¶?????? ???(u),S,E,W,N,???(d) ?????¢?????°??????????????????
	int u;
	int s;
	int e;
	int w;
	int n;
	int d;
	int top;

	public Dice(int[] nums) {
		this.u = nums[0];
		this.s = nums[1];
		this.e = nums[2];
		this.w = nums[3];
		this.n = nums[4];
		this.d = nums[5];
		this.top = this.u;
	}

	public void roll(char dist) {

		int tmp;

		switch (dist) {
		case 'N':
			tmp = u;
			u = s;
			s = d;
			d = n;
			n = tmp;
			break;

		case 'E':
			tmp = u;
			u = w;
			w = d;
			d = e;
			e = tmp;
			break;

		case 'W':
			tmp = u;
			u = e;
			e = d;
			d = w;
			w = tmp;
			break;

		case 'S':
			tmp = u;
			u = n;
			n = d;
			d = s;
			s = tmp;
			break;
		default:
			break;
		}

		this.top = u;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[6];
		for (int i = 0; i < 6; i++) {
			nums[i] = sc.nextInt();
		}
		sc.nextLine();

		String orders = sc.nextLine();
		sc.close();

		Dice dice = new Dice(nums);

		for(char order : orders.toCharArray()) dice.roll(order);

		System.out.println(dice.top);

	}
}