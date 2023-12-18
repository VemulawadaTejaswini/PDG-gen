import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer ans = new StringBuffer();
		sc.close();
		int size = s.length();
		for(int i = 0; i < size;++i){
			ans.append('x');
		}
		System.out.println(ans.toString());
	}
}
