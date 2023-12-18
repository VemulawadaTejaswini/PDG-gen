import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;
        for (int i=0; i<2; i++) {
            if (a>=b) {
                total += a;
                a--;
            } else {
                total += b;
                b--;
            }
        }
        System.out.println(total);
    }
}