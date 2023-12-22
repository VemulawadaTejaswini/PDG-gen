import java.util.HashSet;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			String str = cin.next();
			HashSet<String> s = new HashSet<String>();
			for(int i = 0;i<str.length()-1;i++){
				String s1 = str.substring(0,i+1);
				String s2 = str.substring(i+1,str.length());
				s.add(s1+s2);
				s.add(r(s1)+s2);
				s.add(r(s1)+r(s2));
				s.add(s1+r(s2));
				s.add(s2+s1);
				s.add(r(s2)+s1);
				s.add(r(s2)+r(s1));
				s.add(s2+r(s1));
			}
			System.out.println(s.size());
		}
	}
	static String r(String s){
		String re = "";
		for(int i = 0; i <s.length();i++){
			re = s.charAt(i)+re;
		}
		return re;
	}
}