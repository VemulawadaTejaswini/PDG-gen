import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int n = sc.nextInt(); n > 0; n = sc.nextInt()) {
            int res = 0;
            for(int i = 0; i < n; i++) {
                int min = Integer.MAX_VALUE;
                for(int j = 0; j < n; j++)
                    min = Math.min(min, sc.nextInt());
                res = Math.max(res, min);
            }
            System.out.println(res);
        }
		
	}
}