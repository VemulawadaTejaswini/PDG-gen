import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] abc = new int[3];
        for (int i = 0; i < s.length(); i++) {
            abc[s.charAt(i) - 'a']++;
        }
        int min = Math.min(abc[0], Math.min(abc[1], abc[2]));
        int max = Math.max(abc[0], Math.max(abc[1], abc[2]));
        if (max - min <= 1) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
