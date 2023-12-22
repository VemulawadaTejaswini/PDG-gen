import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hands = new int[5];
		while ((hands[0] = sc.nextInt()) != 0) {
			// data input
			int counthandtypes = 0;
			boolean rock = false, scissors = false, paper = false;
			for (int i = 1; i < 5; i++) {
				hands[i] = sc.nextInt();
			}
			// count hand
			for (int j = 0; j < 5; j++) {
				switch (hands[j]) {
				case 1:
					if (rock == false) {
						rock = true;
						counthandtypes++;
					}
					break;
				case 2:
					if (scissors == false) {
						scissors = true;
						counthandtypes++;

					}
					break;
				case 3:
					if (paper == false) {
						paper = true;
						counthandtypes++;
					}
					break;
				}
			}
			// decide winner
			if (counthandtypes == 1 || counthandtypes == 3) {
				Arrays.fill(hands, 3);
			} else {
				if (scissors == true && paper == true) {
					for (int k = 0; k < 5; k++) {
						if(hands[k] == 2){
							hands[k] = 1;
						}else{
							hands[k] = 2;
						}
					}
				} else if (rock == true && paper == true) {
					for (int k = 0; k < 5; k++) {
						if(hands[k] == 1){
							hands[k] = 2;
						}else{
							hands[k] = 1;
						}
					}
				}
			}
			for(int l = 0;l < 5;l++){
				System.out.println(hands[l]);
			}
		}
	}
}