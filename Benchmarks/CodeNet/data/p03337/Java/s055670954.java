import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans =0;
        if (B>=0){
            System.out.println(Math.max(A+B,A*B));
        }else{
            System.out.println(Math.max(A-B,A*B));
        }

    }
}