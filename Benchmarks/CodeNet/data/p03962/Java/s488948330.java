import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] param = a.split(" ");
		int[] count = {0,0,0};
		int c = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = i+1; j < 3; j++) {
				if (param[i].equals(param[j])) {
					count[i] += 1;
					System.out.println(count[i]);
				}
			}
		}
		for(int k = 0;k<3;k++){
			if(count[k] != 0){
				c++;
			}
		}
		if(c == 0){
			System.out.println("3");
		}else if(c == 2){
			System.out.println("2");
		}else if(c == 3){
			System.out.println("1");
		}

	}
}
