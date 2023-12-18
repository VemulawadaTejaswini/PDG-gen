import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt(),m=s.nextInt();
       int[] in_edge=new int[n+1];
       Map<Integer,Set<Integer>> map=new HashMap<>();
       Map<Integer,Set<Integer>> map2=new HashMap<>();
       for(int i=0;i<m;i++){
        int x=s.nextInt(),y=s.nextInt();
        in_edge[y]++;
        if(map.get(x)!=null){map.get(x).add(y);}
        else{
          map.put(x,new HashSet<Integer>());
          map.get(x).add(y);
        }

        if(map2.get(y)!=null){map2.get(y).add(x);}
        else{
          map2.put(y,new HashSet<Integer>());
          map2.get(y).add(x);
        }
       }
       Queue<Integer> min_heap=new LinkedList<>();
       for(int i=1;i<=n;i++){
        if(in_edge[i]==0){min_heap.add(i);}
       }
       //boolean[] b=new boolean[n+1];
       List<Integer>ts=new ArrayList<>();
       while(!min_heap.isEmpty()){
        int curr=min_heap.poll();
       // b[curr]=true;
       // sb.append(curr+" ");
        ts.add(curr);
        if(map.get(curr)!=null){
          for(int xx:map.get(curr)){
              in_edge[xx]--;
              if(in_edge[xx]==0){min_heap.add(xx);}
          }
        }
       }
       //System.out.println(ts);
       Map<Integer,Integer>indx=new HashMap<>();
       for(int i=0;i<n;i++){indx.put(ts.get(i),i);}
       int[] dp=new int[n];
       int res=0;
       Set<Integer>ss=new HashSet<>();
       ss.add(ts.get(0));
       for(int j=1;j<n;j++){
        int i=ts.get(j);
           if(map2.get(i)!=null){
            for(int zz:map2.get(i)){
                if(ss.contains(zz)){
                    dp[j]=Math.max(dp[j],dp[indx.get(zz)]+1);
                }
            }
           }
       res=Math.max(res,dp[j]);
       ss.add(i);
       }
       System.out.println(res);
        }
    }
