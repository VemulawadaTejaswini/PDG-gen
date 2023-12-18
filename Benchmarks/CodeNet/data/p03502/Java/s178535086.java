import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer sum = 0;
		String output = "No";

		Scanner sc = new Scanner(System.in);

		Integer n = new Integer(sc.next());
		Integer buf = n;
		ArrayList<Integer> data = new ArrayList<Integer>();

		for(int i = 0,len = String.valueOf(buf).length();i<len;i++) {
			data.add(buf%10);
			buf /= 10;
		}

		for(int i = 0; i < data.size();i++) {
			sum += data.get(i);
		}

		if((n%sum) == 0) {
			output = "Yes";
		}
		System.out.println(n+" "+sum+" "+output);

		sc.close();
	}

}