import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i + j) % k == 0) list.add(new Pair(i, j));
            }
        }
        for(int i = 1; i <= n; i++) {
            for(Pair p: list) {
                if((p.x + i) % k == 0 && (p.y + i) % k == 0) {
                    if(p.x == p.y) {
                        if(p.x == i) {
                            count++;
                        }
                    } else {
                        if(p.x == i || p.y == i) {
                            count += 3;
                        }
                        else {
                            count += 6;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
    static class Pair {
        int x;
        int y;
        Pair(int a, int b) {
            x = a;
            y = b;
        }
    }
}