import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        if (s.contains("1".repeat(m)))
            System.out.println(-1);
        else {
            boolean[] gameOver = new boolean[n];
            for (int i = 0; i < n; i++)
                if (s.charAt(i) == '1') gameOver[i] = true;
            String[] sol = helper("",n, m, gameOver).split(",");
            for (int i = sol.length-1;i > 1; i--)
                System.out.print(sol[i]+" ");
            System.out.println(sol[1]);

        }
    }
    private static String helper(String s, int p, int m, boolean[] gameOver){
        String string = "0".repeat(gameOver.length);
        if (p == 0) return s;
        for (int i = m; i > 0; i--) {
            if (p-i >= 0 && !gameOver[p-i]){
                String n = helper(s+","+i, p-i, m, gameOver);
                if (n.length() < string.length()) string = n;
            }
        }
        if (string.equals("0".repeat(gameOver.length))) return s;
        return string;
    }
}
