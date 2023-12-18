import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] monster = new Integer[n + 1];
        for (int i = 0; i < n + 1; i++) {
            monster[i] = sc.nextInt();
        }
        Integer[] bravePower = new Integer[n];
        for (int i = 0; i < n; i++) {
            bravePower[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (monster[i] >= bravePower[i]) {
                result += bravePower[i];
            } else {
                result += monster[i];
                int overKill = Math.max(0, monster[i + 1] - bravePower[i]);
                result += overKill;
                monster[i + 1] = overKill;
            }
        }

        System.out.println(result);
    }
}
