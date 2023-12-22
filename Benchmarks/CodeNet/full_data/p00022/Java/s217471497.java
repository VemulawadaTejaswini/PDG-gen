import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int fin = scan.nextInt();
			if(fin <= 0) {
				break;
			}
			int[] num = new int[fin];
			for(int i = 0;i < fin;i++) {
				num[i] = scan.nextInt();
			}
			int max = Integer.MIN_VALUE;//intで入る一番小さい数字
			for(int i = 0;i < fin;i++) {
				int[] plus = new int[fin];
				for(int j = 0;j < fin - i;j++) {
					if(j == 0) {
						plus[j] = num[i];
					}else{
						plus[j] = plus[j - 1] + num[j + i];
					}
					if(plus[j] > max) {
						max = plus[j];
					}
				}
			}
			System.out.println(max);
			continue;
		}
		scan.close();
	}
}
