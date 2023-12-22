import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = sc.nextLong();
        int count = 0;
        if(N == 1){
            System.out.println(0);
        }else{
            for (int i = 2;i<=N;i++) {
                if (N % i == 0) {
                    N /= i;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
