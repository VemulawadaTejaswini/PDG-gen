import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        if (N%2 != 0) {
        		System.out.println("No");
        } else {
        		String t = S.substring(0, N/2);
            String T = S.substring(N/2);
            if (t.equals(T)) {
            		System.out.println("Yes");
            } else {
            		System.out.println("No");
            }
        } 
    }
}