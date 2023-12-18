import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "";
		for(int i = 0; i < s.length(); i=i+2){
			ans = ans+s.substring(i,i+1);
		}
		System.out.print(ans);
	}
}
