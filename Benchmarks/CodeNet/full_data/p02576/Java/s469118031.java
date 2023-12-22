import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int takoyaki = 0;
        int time = 0;

        while (n > takoyaki) {
            time += t;
            takoyaki += m;
        }
        System.out.println(time);

        sc.close();

        }

    }

