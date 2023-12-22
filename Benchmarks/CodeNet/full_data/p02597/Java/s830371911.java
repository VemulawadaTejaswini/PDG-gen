import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int rcnt = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == 'R') {
                rcnt++;
            }
        }
        int cnt = 0;
        for (int i = 0; i < rcnt; i++) {
            if (c[i] == 'R') {
                cnt++;
            }
        }
        System.out.println(rcnt - cnt);
    }

}
