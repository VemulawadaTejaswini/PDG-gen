import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] sets = new int[n];
        for (int i = 0; i < n; i++) {
            sets[i] = i;
        }

        for (int i = 0; i < q; i++) {
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(com == 0) {
                for (int j = 0; j < n; j++) {
                    if(sets[j] == sets[y]) {
                        sets[j] = sets[x];
                    }
                }
            } else {
                if(sets[x] == sets[y]) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}