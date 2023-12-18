import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.contains("1") && S.contains("9") && S.contains("7") && S.contains("4")) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }
}