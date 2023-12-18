import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        
        double answer = 0;
        for (int i=0; i<n; i++) {
            answer+=(double)1/a[i];
        }
        
        System.out.println( (double) 1 / answer )
    }
}