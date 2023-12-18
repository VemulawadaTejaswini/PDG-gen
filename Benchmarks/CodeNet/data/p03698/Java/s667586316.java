import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String a = "yes";
	for(int i=0; i<s.length(); i++) {
		for(int j=i+1; j<s.length()-i; j++) {
			if(s.charAt(i) == s.charAt(j)) {
				a = "no";
				break;
			}

		}
	}
	System.out.println(a);
}
}
