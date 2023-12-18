import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String ans = sc.nextLine();
        int mid = n/2;
        System.out.println(ans.substring(0, mid).equals(ans.substring(mid)) ? "Yes" : "No");
    }
}