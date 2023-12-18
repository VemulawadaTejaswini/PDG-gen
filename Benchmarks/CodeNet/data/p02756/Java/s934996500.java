import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		while(n-- > 0){
			int format = sc.nextInt();
			if(format == 1){
				s = reverse(s);
			}
			else{
				int pos = sc.nextInt();
				String add = sc.next();
				if(pos == 1){
					s = add + s;
				}
				else{
					s = s + add;
				}
			}
		}
		System.out.println(s);
	}
	public static String reverse(String s){
		String s2 = "";
		for(int i = s.length()-1 ; i>=0; i--){
			s2 += s.charAt(i);
		}
		return s2;
	}
}
