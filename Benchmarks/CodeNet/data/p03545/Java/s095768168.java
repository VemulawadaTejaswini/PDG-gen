import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.nextLine().toCharArray();
		for(int i = 0; i < Math.pow(2, 3); i++) {
			int c_num[] = {Character.getNumericValue(c[1]), Character.getNumericValue(c[2]), Character.getNumericValue(c[3])};			
			String answer[] = new String[3];
			for(int j = 0; j < 3; j++) {
				if((1 & i >> j) == 1) {
					c_num[j] = -c_num[j];
				}
			}
			if(Character.getNumericValue(c[0]) + c_num[0] + c_num[1] + c_num[2] == 7) {
				for(int k = 0; k < 3; k++) {
					if(c_num[k] >= 0) {
						answer[k] = "+" + c_num[k];
					} else {
						answer[k] = String.valueOf(c_num[k]);
					}
				}
				System.out.println(c[0] + answer[0] + answer[1] + answer[2] + "=7");
				break;
			}
		}
	}
}