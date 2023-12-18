import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (W == H && A == B) {
            // OK
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (i+A-1 < W) {
                        System.out.print(i <= j && j <= i+A-1 ? "1" : "0");
                    } else {
                        System.out.print(i <= j || j <= (i+A-1)%W ? "1" : "0");
                    }
                }
                System.out.println();
            }
        } else if (A == 0) {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print((i+1)%(H/B) == 0 ? "1" : "0");
                }
                System.out.println();
            }
        } else if (B == 0) {
            // OK
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print((j+1)%(W/A) == 0 ? "1" : "0");
                }
                System.out.println();
            }
        } else if (W%H == 0 && A%B == 0 && W/H == A/B) {
            // H W A B
            // 4 8 2 1
            // OK
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (i+A/B-1 < H) {
                        System.out.print(i <= j%H && j%H <= i+A/(W/H)-1 ? "1" : "0");
                    } else {
                        System.out.print(i <= j%H || j%H <= (i+A/(W/H)-1)%H ? "1" : "0");
                    }
                }
                System.out.println();
            }
        } else if (H%W == 0 && B%A == 0 && H/W == B/A) {
            // OK
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (i%W+A-1 < W) {
                        System.out.print(i%W <= j && j <= i%W+A-1 ? "1" : "0");
                    } else {
                        System.out.print(i%W <= j || j <= (i%W+A-1)%W ? "1" : "0");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
