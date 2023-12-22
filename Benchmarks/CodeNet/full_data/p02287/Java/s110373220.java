import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static Node root = null;
    static StringBuilder sb = new StringBuilder("");

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int[] a = new int[h];
        for (int i = 0; i < h; i++) {
            a[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder("");
        int parent, left, right;
        for (int i = 0; i < h; i++) {
            sb.append("node ").append(i + 1);
            sb.append(": key = ").append(a[i]);
            parent = (i + 1) / 2 - 1;
            if (parent >= 0) {
                sb.append(", parent key = ").append(a[parent]);
            }
            left = i * 2 + 1;
            if (left < h) {
                sb.append(", left key = ").append(a[left]);
            }
            right = left + 1;
            if (right < h) {
                sb.append(", right key = ").append(a[right]);
            }
            sb.append(", \n");
        }
        System.out.print(sb);

    }
}