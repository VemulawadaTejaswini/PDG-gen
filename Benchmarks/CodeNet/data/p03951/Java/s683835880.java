import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String t = sc.nextLine();
		char[] sa = s.toCharArray();
		char[] ta = t.toCharArray();
		Set hs = new HashSet();
		for (int i=0;i<sa.length;i++){
			hs.add(sa[i]);
			hs.add(ta[i]);
		}
		System.out.println(hs.size());
	}

}
