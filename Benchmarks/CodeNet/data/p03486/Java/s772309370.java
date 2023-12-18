import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		char[] s_chars = s.toCharArray();
		Arrays.sort(s_chars);
		s = String.valueOf(s_chars);

		char[] t_chars = t.toCharArray();
		Arrays.sort(t_chars);
		t = String.valueOf(t_chars);

		if(s.equals(t)){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

	}
}