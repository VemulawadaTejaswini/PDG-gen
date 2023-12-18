import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    boolean[] vis = new boolean[n];
    boolean[] vis1 = new boolean[n];
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      vis1[a-1]=true;
      vis1[b-1]=true;
      int y = Math.max(arr[a-1],arr[b-1]);
      if(arr[a-1]>arr[b-1]){
      if(vis[a-1]==false){
        vis[a-1]=true;
      }
      }
      else if(arr[b-1]>arr[a-1]){
        if(vis[b-1]==false){
        vis[b-1]=true;
      }
      } 
      //int z = Math.min(arr[a-1],arr[b-1]);
      if(arr[a-1]<=arr[b-1]){
      if(vis[a-1]==true){
        vis[a-1]=false;
      }
      }
      else if(arr[b-1]<=arr[a-1]){
       if(vis[b-1]==true){
        vis[b-1]=false;
      }
      } 
    }
    int count=0;
    for(int i=0;i<n;i++){
      if(vis[i]==true || vis1[i]==false){
        count++;
      }
    }
    System.out.println(count);
  }
}