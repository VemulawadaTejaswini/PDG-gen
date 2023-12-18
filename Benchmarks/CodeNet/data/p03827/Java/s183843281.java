import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int [] vals = new int [n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I') {
				count++;
			}else if(s.charAt(i) == 'D') {
				count--;
			}
			vals[i] = count;
		}
		int intMax = vals[0];
		for(int val : vals) {
			if(intMax < val) {
				intMax = val;
			}
		}
		if (intMax < 0) {
			System.out.println(0);
		}else {
			System.out.println(intMax);
		}
	}
}
