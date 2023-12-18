import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        
        int[][] a=new int[N][20];
        for(int i=0;i<N;i++){
            for(int j=0;j<20;j++){
                a[i][j]=(A[i]/(int)Math.pow(2,j))%2;
            }
        }
        
        long ans=0;
        
        int[] s=new int[20];
        for(int i=0;i<20;i++){
            s[i]=a[0][i];
        }
        int r=0;
        
        boolean unreach=true;
        for(int i=0;i<N-1;i++){
            r=Math.max(i+1,r);
            if(r>=N){
                unreach=false;
            }else{
                unreach=true;
            }
            for(int j=r;unreach;j++){
                for(int k=0;k<20;k++){
                    if(a[j][k]+s[k]>1){
                        unreach=false;
                    }
                }
                if(unreach){
                    for(int k=0;k<20;k++){
                        s[k]+=a[j][k];
                    }
                }
                if(unreach){
                    r++;
                }
                if(r>=N){
                    unreach=false;
                }
                
            }
            ans+=r-i;
            for(int k=0;k<20;k++){
                s[i]-=a[i][k];
            }
        }
        ans+=1;
        System.out.println(ans);
    }
}
