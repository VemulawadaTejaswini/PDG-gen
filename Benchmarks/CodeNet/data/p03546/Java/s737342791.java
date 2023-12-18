import java.util.*;

public class Main {
    public static void main(String myon[]){
        Scanner cin=new Scanner(System.in);
        int h=cin.nextInt();
        int w=cin.nextInt();
        int c[][]=new int[11][11];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                c[i][j]=cin.nextInt();
            }
        }
        int a[][]=new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                a[i][j]=cin.nextInt();
            }
        }
        for(int k=0;k<10;k++){
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    c[i][j]=Math.min(c[i][k]+c[k][j],c[i][j]);
                }
            }
        }
        int ans=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(a[i][j]==-1)continue;
                ans+=c[a[i][j]][1];
            }
        }
        System.out.println(ans);
    }
}
