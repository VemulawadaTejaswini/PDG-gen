import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	static long[] d = {0,1,2,3,4,5,6,7,8,9};
	static ArrayList<Long> list = new ArrayList<>();
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();

		int i;
		for(i = 1; i <= 9; i++) {
			sub(i);
		}
		Collections.sort(list);
		System.out.println(list.get(k - 1));
	}
	public static void sub(long a) {
		int len = String.valueOf(a).length();
		int tail = Integer.parseInt(String.valueOf(a).substring(len - 1));
		list.add(a);
		if(len > 11) {
			return;
		}else {

			if(tail == 0) {
				sub(a * 10 + 1);
			}else if(tail == 9) {
				sub(a * 10 + 8);
			}else {
				sub(a * 10 + (tail + 1));
				sub(a * 10 + tail);
				sub(a * 10 + (tail - 1));
			}
		}

	}
}
