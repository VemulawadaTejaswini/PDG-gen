import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sub = b - a + 1;

        if (sub >= k) {
            System.out.println("OK");    
        } else {
            System.out.println("NG");            
        }

    }
}
