import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(K != 0){
            int a = N%K;
            int b = Math.abs(K-a);
            if(a < b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }else{
            System.out.println(0);
        }
    }
} 