import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        StringBuilder builder = new StringBuilder();

        // 最短経路
        int xd = Math.abs(sx - tx);
        int yd = Math.abs(sy - ty);
        // 1回目行き
        builder.append((sy > ty ? "D" : "U").repeat(Math.max(0, yd)));
        builder.append((sx > tx ? "L" : "R").repeat(Math.max(0, xd)));
        // 1回目帰り
        builder.append((sy < ty ? "D" : "U").repeat(Math.max(0, yd)));
        builder.append((sx < tx ? "L" : "R").repeat(Math.max(0, ++xd)));
        // 2回目行き
        builder.append((sy > ty ? "D" : "U").repeat(Math.max(0, ++yd)));
        builder.append((sx > tx ? "L" : "R").repeat(Math.max(0, xd)));
        builder.append((sy < ty ? "D" : "U").repeat(Math.max(0, 1)));
        // 2回目帰り
        builder.append((sx > tx ? "L" : "R").repeat(Math.max(0, 1)));
        builder.append((sy < ty ? "D" : "U").repeat(Math.max(0, yd)));
        builder.append((sx > tx ? "L" : "R").repeat(Math.max(0, xd)));
        builder.append((sy > ty ? "D" : "U").repeat(Math.max(0, 1)));

        System.out.println(builder);
    }
}