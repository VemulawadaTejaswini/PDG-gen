import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        long[] x = new long[n]; 
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            x[i] = a[i];
        }
        
        for(int i=0; i<n; i++){
            b[i] = Integer.parseInt(sc.next());
            x[i] |= ((long)b[i]<<32);
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        boolean ans = true;
        
        for(int i=0; i<n; i++){
            if(a[i] > b[i]){
                ans = false;
                break;
            }
        }
        
        Arrays.sort(x);
        int ls = 0;
        int rs = 0;
        for(int i=0; i<n; i++){
            int tmpa = (int)x[i];
            int tmpb = (int)(x[i]>>32);
            int idx = Arrays.binarySearch(b, tmpa);
            if(idx < 0){
                idx = ~idx;
            }
            
            if(i-1 == idx){
                ls++;
            }else if(idx == i+1){
                rs++;
            }
        }
        
        //System.out.println(ls + " : " + rs);
        
        if(ans && ls!=n-1 && rs!=n-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

