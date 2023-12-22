import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] kazu = new int[3];
		int a = kazu[0], b = kazu[1], c = kazu[2];
		int i;
		for (i = 0; i < kazu.length; i++) {
			kazu[i] = in.nextInt();
		}
		if (kazu[0] <= kazu[1]) {
			if (kazu[1] <= kazu[2]) {
				System.out.println(kazu[0] + " " + kazu[1] + " " + kazu[2]);
			} else if (kazu[2] <= kazu[1]) {
				if (kazu[0] <= kazu[2]) {
					System.out.println(kazu[0] + " " + kazu[2] + " " + kazu[1]);
				}else{
					System.out.println(kazu[2] + " " + kazu[0] + " " + kazu[1]);
				}
			}
		}
		else if (kazu[1] <= kazu[0]) {
			if (kazu[0] <= kazu[2]) {
				System.out.println(kazu[1] + " " + kazu[0] + " " + kazu[2]);
			} else if (kazu[2] <= kazu[0]) {
				if (kazu[1] <= kazu[2]) {
					System.out.println(kazu[1] + " " + kazu[2] + " " + kazu[0]);
				}else{
					System.out.println(kazu[2] + " " + kazu[1] + " " + kazu[0]);
				}
			}
		}
	}
}