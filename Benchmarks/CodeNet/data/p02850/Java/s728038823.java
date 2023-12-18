import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[][] arr=new int[n+1][n+1];
      int[][] arr1=new int[n+1][2];
      int[] bap=new int[n+1];
      Map<Integer,Set<Integer>>map=new HashMap<>();
      int[] in=new int[n+1];
      int max=0;
      for(int i=1;i<n;i++){
        int x=s.nextInt(),y=s.nextInt();
        arr1[i][0]=x;arr1[i][1]=y;
       bap[y]=x;
        in[y]++;
        if(map.get(x)==null){
          map.put(x,new HashSet<>());
          map.get(x).add(y);
        }
        else{map.get(x).add(y);}

        if(map.get(y)==null){
          map.put(y,new HashSet<>());
          map.get(y).add(x);
        }
        else{map.get(y).add(x);}
        max=Math.max(max,Math.max(map.get(x).size(),map.get(y).size()));
      }
      int root=0;
      for(int z=1;z<=n;z++){
        if(in[z]==0){root=z;}
      }
      int k=1;
      Queue<Integer> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
        int curr=q.poll(),tmp=arr[bap[curr]][curr]; 
        for(int xx:map.get(curr)){
          if(arr[curr][xx]!=0){
            continue;
          }
          if(k==tmp){k++;}
          arr[xx][curr]=k;arr[curr][xx]=k;
          k++;
          q.add(xx);
        }
        k=1;
      }
      BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
      System.out.println(max);
      for(int i=1;i<n;i++){
        out.write(arr[arr1[i][0]][arr1[i][1]]+" ");
        out.write("\n");
        out.flush();
      }
        }
      }
      
      
      
    
