import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while( x != 0){
            System.out.printf("Case %d: %d\n", i, x);
            x = sc.nextInt();
            i++;
        }
    }
}
