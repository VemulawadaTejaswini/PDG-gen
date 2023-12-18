import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int m=sc.nextInt();
      int q=sc.nextInt();
      int [][] ss=new int[n][n];
      for(int i=0;i<m;i++){
      	int p=sc.nextInt();
        int o=sc.nextInt();
        ss[p-1][o-1]++;
      }
      int [][]sd=new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(j==0)sd[i][j]=ss[i][j];
            else sd[i][j]=sd[i][j-1]+ss[i][j];
        }
      }
      for(int i=0;i<q;i++){
      	int p=sc.nextInt()-1;
        int o=sc.nextInt()-1;
int ans=0;
if(p==0)for(int j=p;j<=o;j++)ans+=sd[j][o];
else 
       for(int j=p;j<=o;j++)ans+=sd[j][o]-sd[j][p];
        System.out.println(ans);
      }
    }
}