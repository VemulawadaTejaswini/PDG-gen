import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        int a = A.nextInt();
        int b = B.nextInt();
        if ((1 < a && a < 9) && (1 < b && b < 9)){
            System.out.println(a * b);
        }else{
            System.out.println(-1);
        }
    }
}
