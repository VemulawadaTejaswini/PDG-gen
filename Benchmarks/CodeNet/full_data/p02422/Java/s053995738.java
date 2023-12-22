import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String strB = str;
		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			String com = scan.next();
			if(com.equals("print")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				String output = strB.substring(a, b + 1);
			} else if(com.equals("reverse")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				int len = strB.length();
				String s1 = strB.substring(0, a);
				String div = strB.substrin(a, b + 1);
				String s2 = strB.substring(b + 1);
				StringBuilder sb = new StringBuilder();
				for(int j = b; j >= a; j--){
					sb.append(div.charAt(i));
				}
				strB = s1 + sb + s2;
			} else if(com.equals("replace")){
				int a = scan.nextInt();
				int b = scan.nextInt();
				String p = scan.next();
				String s1 = strB.substring(0, a);
				String div = strB.substring(a, b + 1);
				String s2 = strB.substring(b + 1);
				String repl = div.replaceAll("[a-z]", p);
				strB = s1 + repl + s2;
			}
		}
	}
}