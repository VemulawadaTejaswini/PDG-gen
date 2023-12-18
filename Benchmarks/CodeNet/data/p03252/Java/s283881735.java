import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	String T = sc.next();

	for(int i = 0; i<S.length(); i++) {
	    if(S.charAt(i) == T.charAt(i)) continue;
	    S = S.replace(S.charAt(i), '*').replace(T.charAt(i),S.charAt(i)).replace('*',T.charAt(i));
	}
	if(S.equals(T)) {
	    System.out.println("Yes");
	    return;
	}
	System.out.println("No");
    }

}