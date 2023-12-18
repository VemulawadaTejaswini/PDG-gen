import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        String[] ret = new String[n];
        int index = 0;
        int c = a + b;
        int inc = 1;
        int dec = c - 1;
        try {
            for (int i = 0; i < a + b - 1; i++) {
                if (i % 2 == 0) {
                    if(inc < a) {
                        ret[index++] = inc++ + "";
                    }
                    else {
                        ret[index++] = dec-- + "";
                    }
                } else {
                    if(dec > a) {
                        ret[index++] = dec-- + "";
                    }
                    else {
                        ret[index++] = inc++ + "";
                    }
                    for (int j = 0;c <= n && j < a - i / 2 - 1 && j < b + i / 2 -1; j++) {
                        ret[index++] = c++ + "";
                    }
                }
            }
            if(c != n + 1) {
                throw new Exception();
            }
            for (String t : ret) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        catch (Exception e) {
            System.out.println(-1);
        }
    }
}
