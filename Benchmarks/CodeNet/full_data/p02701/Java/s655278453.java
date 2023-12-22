import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static void f(String[] strings){
		Set<String> linkedHashSet = new LinkedHashSet<String>();

		for (int i = 0; i < strings.length; i++) {
		    linkedHashSet.add(strings[i]);
		    }
		 Object[] strings_after = linkedHashSet.toArray();

		 System.out.println(strings_after.length);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String[] S = new String[N];

		for(int i=0;i<N;i++) {
			S[i] = scan.next();
		}

		f(S);

		scan.close();
	}

}
