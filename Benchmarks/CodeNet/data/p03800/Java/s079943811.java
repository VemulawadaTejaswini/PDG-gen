import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String str = reader.next();
		String ans = "-1";
		String[] answers = new String[4];
		answers[0] = "SW";
		answers[1] = "WS";
		answers[2] = "WW";
		answers[3] = "SS";
		for (int k = 0; k < 4; k++) {
			for (int i = 2; i < N; i++) {
				char pre_a = str.charAt(i-1);
				char pre_sw = answers[k].charAt(i-1);
				char pre_pre_sw = answers[k].charAt(i-2);
				boolean same = (pre_sw == 'S' && pre_a == 'o') ||
								(pre_sw == 'W' && pre_a == 'x');
				boolean dif = (pre_sw == 'S' && pre_a == 'x') ||
						(pre_sw == 'W' && pre_a == 'o');
				if (same) {
					answers[k] += pre_pre_sw;
				} else if (dif && pre_pre_sw == 'W') {
					answers[k] += 'S';
				} else if (dif && pre_pre_sw == 'S') {
					answers[k] += 'W';
				} else {
					answers[k] = "";
					break;
				}

			}
		}
		for (int k = 0; k < 4 ;k++) {
			boolean isValid = true;
			for (int i = 3; i < N; i++) {
				char sw = answers[k].charAt(i);
				char pre_a = str.charAt(i-1);
				char pre_sw = answers[k].charAt(i-1);
				char pre_pre_sw = answers[k].charAt(i-2);
				boolean same = ((pre_sw == 'S' && pre_a == 'o') ||
								(pre_sw == 'W' && pre_a == 'x')) &&
								pre_pre_sw == sw;
				boolean dif = ((pre_sw == 'S' && pre_a == 'x') ||
						(pre_sw == 'W' && pre_a == 'o')) &&
						pre_pre_sw != sw;
				isValid = isValid && (same || dif);
			}
			char sw = answers[k].charAt(0);
			char pre_a = str.charAt(N-1);
			char pre_sw = answers[k].charAt(N-1);
			char pre_pre_sw = answers[k].charAt(N-2);
			boolean same = ((pre_sw == 'S' && pre_a == 'o') ||
							(pre_sw == 'W' && pre_a == 'x')) &&
							pre_pre_sw == sw;
			boolean dif = ((pre_sw == 'S' && pre_a == 'x') ||
					(pre_sw == 'W' && pre_a == 'o')) &&
					pre_pre_sw != sw;
			isValid = isValid && (same || dif);
			if (isValid) {
				ans = answers[k];
				break;
			}
		}
		System.out.println(ans);
		reader.close();

	}

}



