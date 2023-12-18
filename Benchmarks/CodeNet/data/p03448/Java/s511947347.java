import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int ans = sc.nextInt();
        int result = 0;

        for(int i = 0; i < num1; i++) {
            for(int j = 0; j < num2; j++) {
                for(int k = 0; k < num3; k++) {
                	if (num1 * i + num2 * j + num3 * k == ans) {
                		result++;
                	}
                }
            }
        }
        System.out.println(result);
    }
}