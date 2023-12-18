import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int[] v = new int[n+1];
        for(int i=0; i<n; i++){
            v[i] = Integer.parseInt(sc.next());
        }
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int max = 0;
        //左から取り出す回数i
        for(int i=0; i<=k; i++){
            int lsum = 0;
            q.clear();
            q.add(0);
            for(int j=0; j<i; j++){
                q.add(v[j]);
                lsum += v[j];
            }
            
            
            {
                //捨てる前に更新
                max = Math.max(max, lsum);
                //左のみ、捨てれるだけ捨ててみる
                //捨てれるだけ捨ててみる
                int l = 0;
                int xsum = lsum;
                for(int tmp : q){
                    if(l>=k-i){
                        break;
                    }
                    xsum -= tmp;
                    l++;
                    max = Math.max(max, xsum);
                }
            }
            
            //右から取り出す個数
            for(int j=0; j<=k-i; j++){
                int rsum = 0;
                q.add(v[n-j]);
                for(int l=0; l<=j; l++){
                    rsum += v[n-l];
                }
                
                //捨てる前に更新
                max = Math.max(max, lsum+rsum);
                
                //捨てれるだけ捨ててみる
                int l = 0;
                for(int tmp : q){
                    if(l>=k-i-j){
                        break;
                    }
                    rsum -= tmp;
                    l++;
                    max = Math.max(max, lsum+rsum);
                }
            }
        }
        
        System.out.println(max);
        
    }
}
