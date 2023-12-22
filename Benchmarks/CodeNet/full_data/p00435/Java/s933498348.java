import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();

			int p;
			StringBuffer ans = new StringBuffer();
			for(int i=0;i<s.length();i++){
				p = s.codePointAt(i);
				if(p<68)p+=26;
				p-=3;
				ans.append((char)p);
			}
			System.out.println(ans.toString());
			
		}
	}
}