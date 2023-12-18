import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(N%(A+B)<A){
            System.out.println((N - N % (A + B)) * A / (A + B) + N % (A + B));
        }
        else{
            System.out.println((N - N % (A + B)) * A / (A + B) + A);
        }
    }
}