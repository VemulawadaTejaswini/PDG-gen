import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int res = 0;
        
        for(int i = 1; i < n; i+=2){
            if(a[i] == a[i-1] || a[i] == a[i+1]){
                res++;
            }
        }
        
        System.out.println(res);
    }
}
