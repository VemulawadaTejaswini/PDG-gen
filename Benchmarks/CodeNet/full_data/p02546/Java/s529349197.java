import java.util.*;
class Solution{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		char c = s.charAt(len-1);
		if(c=='s')s+="es";
		else s+='s';
		System.out.println(s);

	}
}