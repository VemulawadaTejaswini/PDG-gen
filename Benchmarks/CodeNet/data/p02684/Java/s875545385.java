import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int a[] = new int[200000];

        int tmp = 1;

        for(int i = 1; i <= n; i++){
            int A = sc.nextInt();
            a[i] = A;
        }
        sc.close();

        for(int i = 1; i <= k; i++){
            tmp = a[tmp];
        }
            System.out.println(tmp);

    } 
}
