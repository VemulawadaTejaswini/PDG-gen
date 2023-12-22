
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			StringBuilder str = new StringBuilder(sc.next());
			int len = str.length();
			TreeSet<String> ts = new TreeSet<String>();
			for(int i=len -2; i >= 0; i--){

				StringBuilder str1 = new StringBuilder(str.substring(0, i+1));
				StringBuilder str2 = new StringBuilder(str.substring(i+1));
				StringBuilder str3 = new StringBuilder(str1.toString());
				StringBuilder str4 = new StringBuilder(str2.toString());
				str3.reverse();
				str4.reverse();
				ts.add(str1.toString() + str2.toString());
				ts.add(str1.toString() + str4.toString());
				ts.add(str3.toString() + str2.toString());
				ts.add(str3.toString() + str4.toString());
				ts.add(str2.toString() + str1.toString());
				ts.add(str2.toString() + str3.toString());
				ts.add(str4.toString() + str1.toString());
				ts.add(str4.toString() + str3.toString());
			}
			System.out.println(ts.size());
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}