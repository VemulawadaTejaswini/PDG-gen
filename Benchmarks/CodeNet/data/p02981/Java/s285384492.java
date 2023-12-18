import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] stuff = new int[b - a + 3];

        for (int i = a; i < b + 1; i++) {
            stuff[i - a] = i % 2019;
        }

        Arrays.sort(stuff);
        int m = stuff[0] * stuff[1];
        System.out.print(m);
    }
}