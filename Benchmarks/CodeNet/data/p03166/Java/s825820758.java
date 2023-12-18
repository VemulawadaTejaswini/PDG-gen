import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int m=Integer.parseInt(s[1].trim());
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        int[] dist=new int[n];


        while(m-->0){
            s=br.readLine().split(" ");
            int u=Integer.parseInt(s[0].trim())-1;
            int v=Integer.parseInt(s[1].trim())-1;
            al.get(u).add(v);
        }
//        System.out.println(algo(al););
          for(int i=0;i<n;i++){
              if(dist[i]==0){
                  algo(al,dist,i);
              }
//              System.out.println("aa "+i);
          }
          System.out.println(Arrays.stream(dist).max().getAsInt());

    }





    public static void algo(ArrayList<ArrayList<Integer>> al,int[] dist,int u){
        dist[u]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        while(!q.isEmpty()){
        int u1=q.poll();
        for(int v:al.get(u1)){
            if(dist[v]<1+dist[u1])
            {
                dist[v]=1+dist[u1];
                q.add(v);
            }
        }

        }

    }







}
