import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum=0;
        int B = 0;
        for(int i=0;i<N;i++){
            int A = scan.nextInt();
            sum+=A;
            B = A;
        }
        if(B % 2 == 0 && sum % 3 == 0 || sum % 5 == 0) {
            System.out.println("APPROVED");
        }
        else {
            System.out.println("DENIED");
        }
    }
}