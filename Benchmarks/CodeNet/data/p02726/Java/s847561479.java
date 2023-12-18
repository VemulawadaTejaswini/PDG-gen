import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),x = sc.nextInt(),y = sc.nextInt();
    int g[][]=new int[n][n];
    int count[]=new int[n];
    for(int i=0;i<n-1;i++){
      g[i][i+1]=1; g[i+1][i]=1;
    }
    g[x-1][y-1]=1; g[y-1][x-1]=1;

    for(int i=0;i<n;i++){
      int di[]=dijk(n,i,g);
      for(int j=i+1;j<n;j++){
        count[di[j]]++;
      }
    }
    for(int i=1;i<n;i++){
      pl(count[i]+"");
    }
  }

  public static int[] dijk(int n,int s,int g[][]){
    int dist[]=new int[n];
    boolean flg[]=new boolean[n];
    for(int i=0;i<n;i++){dist[i]=100000000;}
    dist[s]=0;
    for(int cou=0;cou<n-1;cou++){
      int min=100000001,num=-1;
      for(int i=0;i<n;i++){
        if(!flg[i]&&min>dist[i]){
          min=dist[i];num=i;
        }
      }
      flg[num]=true;
      for(int i=0;i<n;i++){
        if(g[num][i]==1&&dist[i]>dist[num]+1){
          dist[i]=dist[num]+1;
        }
      }
    }
    return dist;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
