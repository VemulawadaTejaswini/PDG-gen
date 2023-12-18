import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        Arrays.sort(a);
        
        int h = 0;
        int w = 0;
        
        for(int i = n-1; i >= 1; i--){
            if(h != 0 && w != 0) break;
            if(a[i] == a[i-1]){
                if(h == 0) h = a[i]; else if(w == 0 && h != a[i]) w = a[i];
            } 
        }
        
        System.out.println(h*w);
        
    }
}
