import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		int[] takasa = {0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			if(chkInt(scan.next()))
			takasa[i] = Integer.valueOf(scan.next());
		}
		Arrays.sort(takasa);
		for(int i=9;i>6;i--)	System.out.println(takasa[i]);
	}

	public static boolean chkInt(String txt) {
		try {
			Integer.valueOf(txt);
		} catch (Exception e) {
			return false;

		}
		return true;

	}

}