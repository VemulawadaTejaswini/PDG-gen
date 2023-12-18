import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		String t = sc.next();
		int flg = 1;
		for(int i=0;i<s.length();i++){
			if(t.equals(sb.toString())){
				System.out.println("Yes");
				flg = 0;
				break;
			}
			char c = sb.toString().charAt(s.length()-1);
			sb.setLength(sb.length() - 1);
			sb.insert(0, c);
		}
		if(flg==1){
			System.out.println("No");
		}
	}
}