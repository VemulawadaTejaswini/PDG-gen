import java.util.*;

public class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[9]);
        System.out.println(a[8]);
        System.out.println(a[7]);
        
    }
        
}