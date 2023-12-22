import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        if(A+K-1<=B){
            System.out.print("OK");
        }
        else{
            System.out.print("NG");
        }
    }



}
