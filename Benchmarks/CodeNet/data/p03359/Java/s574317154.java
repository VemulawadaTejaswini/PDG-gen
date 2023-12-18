import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= a; i++) {
        	for (int j = 1; j <= b; j++) {
        		if (j == i) {
        			count++;
        			//System.out.println(i + "月" + j + "日");
        		}
        	}
        }
        System.out.println(count);
	}
}
