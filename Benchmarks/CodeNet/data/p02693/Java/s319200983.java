import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A%K==0 || B-A+A%K > K){
            System.out.println("OK");
        }
        else {
            System.out.println("NG");
        }
    }
}

