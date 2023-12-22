import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int i;
        int count = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        for(i=1; i<=c; i++) {
            if(c%i == 0) {
                if(a<=i && b>=i)  count++;
            }
        }

        System.out.printf("%d\n", count);
    }
}
