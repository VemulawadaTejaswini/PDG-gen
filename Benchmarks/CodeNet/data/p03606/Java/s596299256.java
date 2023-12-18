import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        boolean[] isSitting = new boolean[100001];
        
        for(int i=0; i<N; i++){
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            
            for(int j=l; j<=r; j++){
                if(isSitting[j] == false){
                    isSitting[j] = true;
                }
            }
        }
        int ans = 0;
        for(int i=1; i<isSitting.length; i++){
            if(isSitting[i]){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}