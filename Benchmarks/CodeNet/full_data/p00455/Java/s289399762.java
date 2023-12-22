import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            for(int i = 0; i < 3; i++) {
                int start = encode(scn.nextInt(), scn.nextInt(), scn.nextInt());
                int end   = encode(scn.nextInt(), scn.nextInt(), scn.nextInt());
                System.out.println(decode(end - start));
            }
        }
    }

    private static int encode(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }

    private static String decode(int s) {
        return s / 3600 + " " + s % 3600 / 60 + " " + s % 60;
    }
}