import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String[] strStdIn = new String[3];
		int i = 0;
		while (i != 3) {
			strStdIn[i] = scanner.nextLine();
			i++;
		}

		int num = Integer.parseInt(strStdIn[0]);
		String frontString = strStdIn[1];
		String rearString = "";
		String tempRearString = "";
		String answerString = frontString;

		int ret = 0;
		for (int m=num-1; m >= 0; m--) {
			tempRearString = strStdIn[2].substring(0, m+1);
			rearString = strStdIn[2].substring(m+1);

			ret = frontString.lastIndexOf(tempRearString);

			if (ret >= 0) {
				answerString = frontString + rearString;
				break;
			}
			else if (ret == -1) {
				if (0 == m) {
					answerString = frontString + rearString;
					break;
				}
			}
		}

		int judge = answerString.length();
		
		System.out.println(judge);
    	}

}