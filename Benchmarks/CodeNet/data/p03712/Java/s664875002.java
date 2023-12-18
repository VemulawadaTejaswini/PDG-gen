import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        StringBuilder h = new StringBuilder();
        for(int i = 0; i < W + 2; i++) {
            h.append("#");
        }
        String header = h.toString();
        System.out.println(header);
        for(int i = 0; i < H; i++) {
            String s = scan.next();
            System.out.println("#" + s + "#");
        }
        System.out.println(header);
    }
}