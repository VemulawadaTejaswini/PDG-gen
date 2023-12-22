import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (true) {
            int a = sc.nextInt();
            if(a == 0){
                break;
            }
            System.out.printf("Case %d: %d\n", n, a);
            n++;
        }
    }
}
