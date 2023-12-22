import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int KA = A/K; int KB = B/K;

        if(KA<KB){
            System.out.println("OK");
        } else if(A%K==0){
            System.out.println("OK");
        } else if(B%K==0){
            System.out.println("OK");
        } else{
            System.out.println("NG");
        }

        sc.close();
    }
}