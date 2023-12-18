import java.util.*;
 
public class Main{
    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),C=sc.nextInt();
        int[][] sch = new int[N][3];
        for(int i=0;i<N;i++)for(int j=0;j<3;j++)sch[i][j]=sc.nextInt();
        int ans = 0;
        for(int k=0;k<N;k++){
            int i=sch[k][0]-1;
            int c = 0;
            for(int j=0;j<N;j++)if(i>=sch[j][0]-1&&i<sch[j][1])c++;
            ans = Math.max(ans,c);
        }
        System.out.println(ans);
    }
}