import java.io.IOException;
import java.util.*;

public class Main {
    public static int map[][]=new int[11][11];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<D;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int ans=0;

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                double test=0;
                for(int l=0;l<D;l++){
                    test+=make_double(map[i][l],map[j][l]);
                }
                test=Math.sqrt(test);
                double test2=Math.floor(test);
                if(test==test2)
                    ans++;
            }
        }
        System.out.println(ans);

    }

    public static double make_double(int x,int y){
        double ans=(x-y)*(x-y);
        return ans;
    }


}