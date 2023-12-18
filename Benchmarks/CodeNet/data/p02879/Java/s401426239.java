import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        do {
            A = sc.nextInt();
        }while (A<1 || A>20);
        do {
            B = sc.nextInt();
        }while(B<1 || B>20);
        if (A>10 || B>9){
            System.out.println("-1");
        }else{
            System.out.println(A*B);
        }
    }
}