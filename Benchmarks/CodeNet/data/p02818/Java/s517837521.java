import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        
        if(A>=K){
            System.out.println(A-K + " " + B);
        } else if(A+B > K){
            System.out.println(0+" "+(A+B-K));
        } else {
            System.out.println(0+" "+0);
        }
    }
}
