import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ret = A;
        if (A<B) {
            ret = B;
            B--;
        }
        else {
            A--;
        }

        if (A>B) {
            ret += A;
        }
        else {
            ret += B;
        }


        System.out.println(ret);
    }

}
