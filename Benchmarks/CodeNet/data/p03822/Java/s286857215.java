import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tournament> q = new ArrayList<>();
        int n = sc.nextInt();

        Tournament[] t = new Tournament[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Tournament(i + 1);
        }

        for (int i = 1; i < n; i++) {
            t[i].lose = sc.nextInt() - 1;
            t[t[i].lose].win++;
            t[t[i].lose].hight++;
        }

        for (int i = 0; i < n; i++) {
            if (t[i].win == 0) q.add(t[i]);
        }

        while (!q.isEmpty()) {
            Tournament tmp = q.get(0);
            q.remove(0);
            t[tmp.lose].connect++;
            t[tmp.lose].hight = Math.max(t[tmp.lose].hight, t[tmp.lose].hight - t[tmp.lose].connect + tmp.hight + 1);
            if (tmp.lose != 0 && t[tmp.lose].connect == t[tmp.lose].win) q.add(t[tmp.lose]);
        }

        System.out.println(t[0].hight);
    }

    private static class Tournament {
        int num;
        int lose, win;
        int connect;
        int hight;
        Tournament(int n) {
            num = n;
            lose = win = connect = hight = 0;
        }
    }
}
