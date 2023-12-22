import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int div = K / A - 1;
        int tmp = div * K;
        boolean results = false;
        while(tmp <= B){
            if(tmp <= B && tmp >= A){
                results = true;
                break;
            }
            div++;
            tmp = div * K;
        }

        if(results){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}
