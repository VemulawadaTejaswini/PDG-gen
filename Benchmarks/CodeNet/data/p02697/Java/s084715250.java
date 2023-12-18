import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        final int n2 = N/2;
        if((N%2 == 0) && n2 % 2 == 1){
            for(int i=1;i<=M;i++){
                int b = 2*M-i+2;
                System.out.println(i + " " + b);
            }
            return;
        }
        for(int i=1;i<=M;i++){
            int b = 2*M-i+1;
            System.out.println(i + " " + b);
        }
    }
}
