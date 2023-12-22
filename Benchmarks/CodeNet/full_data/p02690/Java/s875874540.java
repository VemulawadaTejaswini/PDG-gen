import java.util.Scanner;

public class ABC166D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        for (int i = -118; i <= 199; i++) {
            for (int j = -119; j <= 118; j++) {
                if (X == Math.pow(i, 5) - Math.pow(j, 5)) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}