import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = (int)Math.pow(3,n);
        int count = 1;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                count=count*2;
            }
        }
        
        System.out.println(ans-count);
        
    }
}
