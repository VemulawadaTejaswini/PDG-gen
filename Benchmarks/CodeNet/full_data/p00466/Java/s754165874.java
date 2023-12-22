import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int d = sc.nextInt();
            if(d==0)break;
            for (int i = 1; i < 10; i++) {
                d -= sc.nextInt();
            }
            System.out.println(d);
        }
    }
}
