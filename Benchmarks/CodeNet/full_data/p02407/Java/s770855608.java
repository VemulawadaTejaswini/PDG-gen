import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n-1; i++){
            System.out.printf(a[n-i-1] + " ");
        }
        System.out.println(a[0]);
    }
}
