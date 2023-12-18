
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static String S;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    S=gs();

	    List<String> l=new ArrayList<String>();
	    String c=String.valueOf(S.charAt(0));
	    l.add(c);
	    long a=f(1, l);



	    System.out.println(a);
	}

	public static long f(int index, List<String> num) {
		if (index==S.length()) {
			long sum = 0;
			for (int i=0; i<num.size();i++) {
				long n=Long.parseLong(num.get(i));
				sum+=n;
			}
			return sum;
		}
		String c=String.valueOf(S.charAt(index));

		long ans=0;
		List<String> l=new ArrayList<String>();
		l.addAll(num);
		l.add(c);
		ans+=f(index+1, l);

		List<String> l2=new ArrayList<String>();
		l2.addAll(num);
		String cn=l2.get(l2.size()-1) + c;
		l2.set(l2.size()-1, cn);
		ans+=f(index+1, l2);

		return ans;
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}