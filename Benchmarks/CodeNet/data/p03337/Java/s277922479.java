import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int result = Math.max(A+B,Math.max(A-B,A*B));
        System.out.println(result);

    }
}