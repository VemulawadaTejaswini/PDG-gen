import java.util.Scanner;

public class Main {
    int a, b, c, d, e, f;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        SugarWater sw = bfs(0, 0);
        System.out.println(sw.sugarWater() + " " + sw.sugar);
    }

    SugarWater bfs(int water, int sugar) {
        if (water + sugar > f) {
            return new SugarWater(0, water);
        }

        SugarWater maxResolution = new SugarWater(sugar, water);
        SugarWater acw = bfs(water + 100 * a, sugar + c);
        if (maxResolution.sugar * acw.sugarWater() < acw.sugar * maxResolution.sugarWater()) {
            maxResolution = acw;
        }

        SugarWater adw = bfs(water + 100 * a, sugar + d);
        if (maxResolution.sugar * adw.sugarWater() < adw.sugar * maxResolution.sugarWater()) {
            maxResolution = adw;
        }

        SugarWater bcw = bfs(water + 100 * b, sugar + c);
        if (maxResolution.sugar * bcw.sugarWater() < bcw.sugar * maxResolution.sugarWater()) {
            maxResolution = bcw;
        }

        SugarWater bdw = bfs(water + 100 * b, sugar + d);
        if (maxResolution.sugar * bdw.sugarWater() < bdw.sugar * maxResolution.sugarWater()) {
            maxResolution = bdw;
        }

        return maxResolution;
    }

    static class SugarWater {
        int sugar;
        int water;

        SugarWater(int sugar, int water) {
            this.sugar = sugar;
            this.water = water;
        }

        int sugarWater () {
            return sugar + water == 0 ? 1 : sugar + water;
        }
    }
}
