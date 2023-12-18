import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

    static int f_max=0;
static void dfs(Map<Integer,Set<Integer>>map, int x,int t_max){
    if(map.get(x)!=null){
        for(int xx:map.get(x)){
            dfs(map,xx,t_max+1);
        }
    }
    f_max=Math.max(f_max,t_max);
    }	

public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt(),m=s.nextInt();
         Map<Integer,Set<Integer>>map=new HashMap<>();
         for(int i=0;i<m;i++){
            int x=s.nextInt(),y=s.nextInt();
            if(map.get(x)==null){
                map.put(x,new HashSet<>());
                map.get(x).add(y);
            }
            else{map.get(x).add(y);}
         }
         for(int i=1;i<=n;i++){
            if(map.get(i)==null){continue;}
            dfs(map,i,0);
         }
         System.out.println(f_max);
        }
    }
