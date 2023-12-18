import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int minMod = 2019;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                int tmpMod = (i * j) % 2019;
                if (tmpMod < minMod) {
                    minMod = tmpMod;
                }
            }
        }
        System.out.println(minMod);
    }
}