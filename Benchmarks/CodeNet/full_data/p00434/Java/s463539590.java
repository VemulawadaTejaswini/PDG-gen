import java.util.Scanner;

public class Main
 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[30];
		for (int i = 0; i < 28; i++){
			int n = sc.nextInt();
			x[n - 1]++;
		}
		int i = 0;
		int flag = 2;
		while (flag > 0){
			if (x[i] == 0){
				System.out.println(i + 1);
				flag--;
			}
			i++;
		}
	}

}

