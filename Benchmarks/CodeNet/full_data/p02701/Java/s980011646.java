
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    /*
     * https://atcoder.jp/contests/abc164/tasks/abc164_c
     */

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int jogen = Integer.parseInt(stdIn.nextLine());

        Set<String> gacha = new HashSet<>(jogen);
        for (int i = 0; i < jogen; i++) {
            gacha.add(stdIn.nextLine());
        }
        stdIn.close();

        System.out.println(gacha.size());

    }
}