import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        boolean[] isSelected=new boolean[N];
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            isSelected[i]=false;
        }
        
        int leftidx=0;
        int rightidx=N-1;
        long ans=0;
        
        for(int i=0;i<N;i++){
            int nxtmax=-1;
            int nxtidx=0;
            for(int j=0;j<N;j++){
                if(nxtmax<A[j]&&!isSelected[j]){
                    nxtmax=A[j];
                    nxtidx=j;
                }
            }
            isSelected[nxtidx]=true;
            if(nxtidx-leftidx<rightidx-nxtidx){
                ans+=nxtmax*(rightidx-nxtidx);
                rightidx--;
            }else{
                ans+=nxtmax*(nxtidx-leftidx);
                leftidx++;
            }
        }
        
        System.out.println(ans);
    }
}
