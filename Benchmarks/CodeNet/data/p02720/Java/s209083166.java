import java.util.*;

public class Main {
    public static int abs(int a){
        return (a>0)?a:(-a);
    }
    
    public static int isRunrun(int[] ans){
        int size=ans.length;
        for(int i=0;i<size;i++){
            if(i!=0){
                if(abs(ans[i]-ans[i-1])>1){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int[] ans=new int[20];
        int idx=0;
        
        for(int i=0;i<20;i++){
            ans[i]=0;
        }
        
        for(int i=0;i<K;i++){
            if(isRunrun(ans)==-1){
                ans[idx]++;
                for(int j=19;j>=0;j--){
                    if(ans[j]>9){
                        ans[j]-=10;
                        ans[j-1]++;
                    }
                }
                
            }else{
                idx=isRunrun(ans);
                ans[idx]++;
                for(int j=19;j>=0;j--){
                    if(ans[j]>9){
                        ans[j]-=10;
                        ans[j-1]++;
                    }
                }
                for(int j=idx;j<19;j++){
                    if(ans[j]>0){
                        ans[j+1]=ans[j]-1;
                    }else{
                        ans[j+1]=0;
                    }
                }
            }
        }
        
        for(int i=0;i<20;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}
