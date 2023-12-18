import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int tmpa = sc.nextInt();
            int tmpb = sc.nextInt();
            if(tmpa == 1) {
                list.add(tmpb);
            }
            if(tmpb == n) {
                a.add(tmpa);
                b.add(tmpb);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            for (int j = 0; j < a.size(); j++) {
                if(tmp == a.get(j)) {
                    if(n == b.get(j)) {
                        System.out.println("POSSIBLE");
                        return;
                    }
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
