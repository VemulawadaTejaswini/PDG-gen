import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i == n) System.out.printf("%d",i);
                else System.out.printf("%d ", i);
            }
            else if (i % 10 == 3) {
                if(i==n) System.out.printf("%d",i);
                 else   System.out.printf("%d ", i);
            }
            else if((i/10)%10==3) {
                if(i==n) System.out.printf("%d",i);
                else System.out.printf("%d ",i);
            }
        }
    }
}
