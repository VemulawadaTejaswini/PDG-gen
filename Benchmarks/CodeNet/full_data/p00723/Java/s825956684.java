import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		for(int i=0; i<data; i++){
			String str = sc.next();
			HashSet<String> hs = new HashSet<String>();

			hs.add(str);
			for(int j=1;j<str.length();j++){
				String before = str.substring(0, j);
				String after = str.substring(j, str.length());
				hs.add(after + before);
				before = new StringBuilder(before).reverse().toString();
				hs.add(before + after);
				hs.add(after + before);
				after = new StringBuilder(after).reverse().toString();
				hs.add(before + after);
				before = new StringBuilder(before).reverse().toString();
				hs.add(before + after);
				hs.add(after + before);
			}
			str = new StringBuilder(str).reverse().toString();
			hs.add(str);

			System.out.println(hs.size());
		}
	}
}