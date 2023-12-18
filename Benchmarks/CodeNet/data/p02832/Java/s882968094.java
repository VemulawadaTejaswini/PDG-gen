import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ans=-1;
        int[] a = new int[n];
        int one=0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i]==1){
                one++;
            }
        }
        
        if(one==0){
            System.out.println(ans);
            return;
        }
        
        ans=0;
        int count=1;
        for(int i=0; i<n; i++){
            if(a[i]==1){
                ans = i;
                count++;
                //System.out.println(a[i]);
            }else if(a[i]==count){
                count++;
                //System.out.println(a[i]);
            }else{
                if(a[i]!=count){
                    ans++;
                    //System.out.println(a[i]);
                }
            }
            //System.out.println(count);
        }
        
        System.out.println(n-count+1);
    }
}
