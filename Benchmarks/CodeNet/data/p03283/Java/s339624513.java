import java.util.*;

public class Main {
    public static class Area implements Comparable<Area>{
        int left;
        int right;
        
        void Area(int x,int y){
            this.left=x;
            this.right=y;
        }
        
        public int compareTo(Area a){
            return this.left-a.left;
        }
        
        public void tostring(){
            System.out.println("["+this.left+","+this.right+"]");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int Q=sc.nextInt();
        Area[] LR=new Area[M];
        int[] idx=new int[N+2];
        idx[N+1]=M-1;
        
        for(int i=0;i<N;i++){
            idx[i]=-1;
        }
        idx[0]=0;
         
        for(int i=0;i<M;i++){
            Area area=new Area();
            area.Area(sc.nextInt(),sc.nextInt());
            LR[i]=area;
        }
        
        Arrays.sort(LR);
        
        for(int i=0;i<M;i++){
            if(i==0){
                int tmp=LR[i].left;
                idx[tmp]=0;
            }else{
                if(LR[i].left!=LR[i-1].left){
                    idx[LR[i].left]=i;
                }
            }
        }
        
        for(int i=0;i<N+1;i++){
            if(idx[i]==-1){
                idx[i]=idx[i-1];
            }
        }
        for(int i=0;i<Q;i++){
            int p,q;
            p=sc.nextInt();
            q=sc.nextInt();
            int ans=0;
            for(int j=idx[p];j<=idx[q+1];j++){
                if(p<=LR[j].left&&LR[j].right<=q){
                    ans++;
                }
            }
            System.out.println(ans);
        }
        
    }
}
