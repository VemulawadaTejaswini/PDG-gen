import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int h[] = new int[n + 1];
        boolean m[] = new boolean[n + 1];
        
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            m[i] = true;
        }
        
        int innCounter = 0;
        
        for(int idx = 0; idx < n; idx++){
                for(int k = 0; k < idx; k++){
                    if(h[idx] < h[k]){
                        m[idx] = false;
                    }else{
                        //処理なし
                    }
                }
                if(m[idx]){
                    innCounter++;
                }
        } 
        System.out.println(innCounter);
        
    }
}
