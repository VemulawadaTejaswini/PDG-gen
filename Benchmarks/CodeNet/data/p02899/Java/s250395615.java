import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            res[a[i] - 1] = i + 1;
        }
        for(int i=0;i<n-1;i++){
            System.out.print(res[i] + " ");
        }
        System.out.println(res[n-1]);
    }
}
