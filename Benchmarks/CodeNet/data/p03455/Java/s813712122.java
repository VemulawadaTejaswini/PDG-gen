import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);

            String answer = "Odd";
            if (a%2 == 0 || b%2 == 0) {
            	answer = "Even";
			}

            System.out.println(answer);

		} catch (Exception e) {
            e.printStackTrace();
        }
    }
}
