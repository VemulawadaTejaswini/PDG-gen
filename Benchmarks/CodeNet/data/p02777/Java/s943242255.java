import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S;
        String T;
        String U;

        S = sc.nextLine();
        T = sc.nextLine();
        int A = sc.nextInt();
        int B = sc.nextInt();
        U = sc.next();

        if(U!=S) {
            B--;
        }
        else if(U!=T) {
            A--;
        }

        System.out.println(A + " " + B);


    }

}