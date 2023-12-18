import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] input = new int[N];
		boolean[] flag = new boolean[N];
		for(int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
			flag[i] = checkEqual(i, input[i]);
		}

		while(checker(flag)) {
			for(int i = 0; i < N; i++) {
				if(flag[i]) {
					if(i != 0 && i != N - 1) {
						if(checkEqual(i, input[i+1])){
							int c = input[i];
							input[i] = input[i + 1];
							input[i+1] = c;
							count++;
							flag[i] = checkEqual(i, input[i]);
							flag[i+1] = checkEqual(i+1, input[i+1]);
						} else {
							int c = input[i];
							input[i] = input[i-1];
							input[i-1] = c;
							count++;
							flag[i] = checkEqual(i, input[i]);
							flag[i-1] = checkEqual(i-1, input[i-1]);

						}
					} else if (i == 0){
						int c = input[i];
						input[i] = input[i + 1];
						input[i+1] = c;
						count++;
						flag[i] = checkEqual(i, input[i]);
						flag[i+1] = checkEqual(i+1, input[i+1]);
					} else {
						int c = input[i];
						input[i] = input[i-1];
						input[i-1] = c;
						count++;
						flag[i] = checkEqual(i, input[i]);
						flag[i-1] = checkEqual(i-1, input[i-1]);
					}
				}
			}
		}

		System.out.println(count);

	}

	public static boolean checkEqual(int index, int input) {
		index += 1;
		if(index == input) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checker(boolean[] flag) {
		for(int i = 0; i < flag.length; i++) {
			if(flag[i]) {
				return true;
			}
		}
		return false;
	}

}