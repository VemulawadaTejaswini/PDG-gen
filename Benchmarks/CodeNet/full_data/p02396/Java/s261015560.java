import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int x;

        while(true) {
            if((x = Integer.parseInt(sc.next()))== 0) {
                break;
            }
                System.out.printf("Case %d: %d", ++i, x);
        }
    }
}
