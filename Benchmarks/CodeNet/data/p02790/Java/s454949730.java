import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a=sc.nextInt(),b=sc.nextInt();
		Set<String> set = new TreeSet<>();
		String A="",B="";

		for(int i=0;i<a;i++) {
			B+=b.toString();
		}
		for(int i=0;i<b;i++) {
			A+=a.toString();
		}
		set.add(A);
		set.add(B);
		for(String str : set) {
				System.out.println(str);
			return;
		}

	}
}