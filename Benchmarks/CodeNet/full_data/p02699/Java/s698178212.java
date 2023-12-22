import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Set<String> a=new HashSet<String>();
		String s = null;
		int a1=0;
		ff b=new ff();
		Scanner scanner = new Scanner(System.in);
		a1 = scanner.nextInt();
		while(a1--!=0) {
			s = scanner.next();
			a.add(s);
		}
		System.out.println(a.size());
		}

}
