import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");

        String result = "No";
        if (n[0].equals(n[1]) && n[0].equals(n[2]) || n[1].equals(n[2]) && n[1].equals(n[3])) result = "Yes";
        if (n[0].equals(n[1]) && n[0].equals(n[2]) && n[0].equals(n[3])) result = "Yes";
        System.out.println(result);
    }
}
