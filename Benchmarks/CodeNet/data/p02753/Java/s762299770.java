import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println((S.substring(0,1).equals(S.substring(1,2)) && S.substring(1,2).equals(S.substring(2,3))) ? "No" : "Yes");
    }
}