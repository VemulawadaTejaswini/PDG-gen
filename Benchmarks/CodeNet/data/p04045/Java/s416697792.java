import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		List<Integer> D = new ArrayList<Integer>();
		for(int i=0;i<K;i++) {
			 D.add(scanner.nextInt());
		}
		for(int m = N;m<=99999;m++) {
			if(check(D,m)) {
				System.out.println(m);
				break;
			}
		}
		scanner.close();
	}
	public static boolean check(List<Integer> d, int n) {
		String num = String.valueOf(n);
		for(int i=0;i<num.length();i++) {
			int s = Character.getNumericValue(num.charAt(i)) ;
			if(d.contains(s)) {
				return false;
			}
		}
		return true;
	}
}
