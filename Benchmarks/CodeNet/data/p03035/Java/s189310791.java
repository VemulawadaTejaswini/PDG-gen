import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

        if(A >= 13) {
            System.out.println(B);
        }else if(6 <= A || A <= 12) {
            System.out.println(B/2);
        }else {
            System.out.println(0);
        }
    }
}