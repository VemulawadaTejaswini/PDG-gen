import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        int ans = t.length();

        String[] as = s.split("");
        String[] at = t.split("");

        for (int i = 0; i < as.length - at.length + 1; i++) {
            int count = 0;
            for (int j = 0; j < at.length; j++) {
                if (as[i + j].equals(at[j])) {
                    count++;
                }
            }
            int tmp = at.length - count;
            ans = Math.min(ans, tmp);
        }
        System.out.println(ans);
    }
}
