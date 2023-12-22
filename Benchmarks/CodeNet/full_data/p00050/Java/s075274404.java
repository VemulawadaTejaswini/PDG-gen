import java.util.*;

//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0064&lang=jp
public class Main {
	static String replaceAorP(String str){
		return str.equals("apple") ? "peach" :
			str.equals("peach") ? "apple" : str;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result=replaceAorP(sc.next());
		while(sc.hasNext()){
			System.out.println(result);
			result += " " + replaceAorP(sc.next());
		}
		System.out.println(result);
	}
}