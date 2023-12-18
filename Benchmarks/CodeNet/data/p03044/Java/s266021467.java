import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] path = new int[n+1][2];
    int[][] len = new int[n+1][n+1];
    for(int i=1;i<=n-1;i++){
      for(int j=0;j<2;j++){
        path[i][j]=sc.nextInt();
      }
      len[path[i][0]][path[i][1]]=sc.nextInt();
      len[path[i][1]][path[i][0]]=len[path[i][0]][path[i][1]];
    }
    ArrayList<Integer>[] graph = new ArrayList[n+1];
    for(int i=1;i<=n;i++)graph[i] = new ArrayList<Integer>();
    for(int i=1;i<=n-1;i++){
      graph[path[i][0]].add(path[i][1]);
      graph[path[i][1]].add(path[i][0]);
    }
    int[] color = new int[n+1];
    for(int i=1;i<=n;i++){
      for(int j:graph[i]){
        if(len[i][j]%2==0)color[j]=color[i];
        else color[j]=(color[i]+1)%2;
      }
    }
    for(int i=1;i<=n;i++)System.out.println(color[i]);
  }
}