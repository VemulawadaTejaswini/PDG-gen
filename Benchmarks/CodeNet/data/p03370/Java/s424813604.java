import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int k[] = new int[n];
        int all = 0,min = Integer.MAX_VALUE;
        for (int i = 0;i < n;++i){
            k[i] = sc.nextInt();
            all += k[i];
            if(min > k[i])min = k[i];
        }

        System.out.println(n + (a - all) / min);
    }
}