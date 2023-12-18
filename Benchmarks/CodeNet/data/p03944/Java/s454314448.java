
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt(),h=sc.nextInt();
        int n=sc.nextInt();
        int[] x = new int[n],y=new int[n],a=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            a[i]=sc.nextInt();
        }

        boolean[][] map = new boolean[h][w];
        for(int i=0;i<h;i++)for(int j=0;j<w;j++)map[i][j]=false;

        for(int i=0;i<n;i++){



            if(a[i]==1){
                for(int j=0;j<x[i];j++)for(int k=0;k<h;k++)map[k][j]=true;
            }else if(a[i]==2){
                for(int j=w-1;j>=x[i];j--)for(int k=0;k<h;k++)map[k][j]=true;
            }else if(a[i]==3){
                for(int j=0;j<y[i];j++)for(int k=0;k<w;k++)map[j][k]=true;
            }else if(a[i]==4){
                for(int j=h-1;j>=y[i];j--)for(int k=0;k<w;k++)map[j][k]=true;
            }
            
        }

        int ans = 0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(!map[i][j])ans++;
            }
        }
        System.out.println(ans);


    }
}
