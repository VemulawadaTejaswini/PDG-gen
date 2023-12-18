import java.util.*;

public class Main{
    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(),C=sc.nextInt();
        int[][] sch = new int[N][3];
        for(int i=0;i<N;i++)for(int j=0;j<3;j++)sch[i][j]=sc.nextInt();
        for(int i=0;i<N;i++)sch[i][0]-=1;
        int max = searchMax(sch),min = searchMin(sch);
        int ans = 0;
        for(int i=min;i<=max;i++){
            int c = 0;
            for(int j=0;j<N;j++)if(i>=sch[j][0]&&i<sch[j][1])c++;
            ans = Math.max(ans,c);
        }
        System.out.println(ans);
    }
    
    public static int searchMax(int[][] a){
        int max =0;
        for(int i=0;i<a.length;i++){
            if(i==0)max=a[i][0];
            max=Math.max(max,a[i][0]);
        }
        return max;
    }
    
    public static int searchMin(int[][] a){
        int min =0;
        for(int i=0;i<a.length;i++){
            if(i==0)min=a[i][0];
            min=Math.min(min,a[i][0]);
        }
        return min;
    }
}