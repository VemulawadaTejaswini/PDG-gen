import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        String res = "No";
        if (A == B) if (A != C) res = "Yes";
        if (A != B) if (A == C || B == C) res = "Yes";

        System.out.println(res);
    }
}