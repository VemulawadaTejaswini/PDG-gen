import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] l = new char[8][8];
        for (int i = 0; i < 8; i++) {
            l[i] = sc.next().toCharArray();
        }
        char[][] t = new char[8][8];
        for (int i = 1; i < 4; i++) {
            System.out.println(i * 90);
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    t[j][k] = l[7 - k][j];
                    System.out.print(t[j][k]);
                }
                System.out.println();
            }
            for (int j = 0; j < 8; j++) {
                l[j] = t[j].clone();
            }
        }
    }
}

