import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[m + 1];
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        a[0] = x;
        b[0] = y;
        for(int i = 1; i < n + 1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1; i < m + 1; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
        System.out.println(a[n] < b[0] ? "No War" : "War");
    }
}
