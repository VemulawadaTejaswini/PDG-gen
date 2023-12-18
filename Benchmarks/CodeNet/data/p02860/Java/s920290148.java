import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String S = sc.next();
        System.out.println(solve(n,S));
    }
    private static String solve(int N, String s) {
        if(N%2 == 1) return "No";
        if(s.substring(0, N/2).equals(s.substring(N/2))) return "Yes";
        return "No";
    }
}