import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        // 200^5 - 199^5 = 7920399001 > 10^9 であることから、200まで前探索すればOKっしょ
        for(long a=0; a<=200; a++) {
            long b_init = a+1;
            long b_end = 200;
            if(a<x) {
                b_init = -200;
                b_end = 0;
            }
            for(long b=b_init; b<=b_end; b++) {
                long a5 = a*a*a*a*a;
                long b5 = b*b*b*b*b;
                if(x==a5-b5) {
                    System.out.print(a);
                    System.out.print(" ");
                    System.out.println(b);
                    return;
                }
            }
        }
    }
}
