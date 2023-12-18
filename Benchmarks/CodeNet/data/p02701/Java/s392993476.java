import java.util.*;
public class Main{


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		long s  =sc.nextLong();
	 HashSet<String> ss = new HashSet<String>();
		while(s-->0) {
			String as = sc.next();
			ss.add(as);
		}
		System.out.println(ss.size());
	}

}
