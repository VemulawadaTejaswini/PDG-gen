import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int result = B/2;

        if (A >= 13){
            result = B;
        }else if(A <= 5){
            result = 0;
        }

        System .out.println(result);

    }
}