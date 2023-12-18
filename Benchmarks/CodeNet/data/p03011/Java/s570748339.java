import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int A = a + b;
        int B = b + c;
        int C = a + c;
        if (A > B) {
            if (B > C) {
                System.out.println(C);
            } else  {
                System.out.println(B);
            }
        } else if(A>C){
            System.out.println(C);
        }else {
            System.out.println(A);
        }
    }

}
