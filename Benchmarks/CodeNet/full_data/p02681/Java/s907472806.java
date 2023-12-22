import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        boolean f = true;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) != T.charAt(i)) f = false;
        }
        if(f == true && T.length() == S.length()+1) System.out.println("Yes");
        else System.out.println("No");
	}
}