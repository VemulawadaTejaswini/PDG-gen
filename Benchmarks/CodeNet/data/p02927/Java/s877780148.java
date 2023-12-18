import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int d = in.nextInt();
        int c = 0;
        for(int d10=2; d10<10; d10++) {
            for(int d1=2; d1<10; d1++) {
                if(d10*10 + d1 > d) {
                    break;
                }
                if(d10*d1 <= m) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
