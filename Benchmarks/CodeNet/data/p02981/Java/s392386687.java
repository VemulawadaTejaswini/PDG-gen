import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N A B
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int train = N * A;

        int taxi = B;

        if(train >= taxi){
            System.out.println(taxi);
            return;
        }
        if(train <= taxi){
            System.out.println(train);
            return;
        }




    }



}
