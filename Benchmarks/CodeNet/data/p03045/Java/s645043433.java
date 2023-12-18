import java.io.*;
import java.util.*;


public class Main {
    static int n,count;
    static int[] id;
    public static void main(String[] args) throws Exception{
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = reader.readLine().split(" ");
        n = Integer.parseInt(buf[0]);
        int m = Integer.parseInt(buf[1]);
        count = n;
        id = new int[n+1];
        for(int i=0;i<=n;i++) id[i]=i;
        for(int i=0;i<m;i++){
            buf = reader.readLine().split(" ");
            int u = Integer.parseInt(buf[0]), v = Integer.parseInt(buf[1]);
            int len = Integer.parseInt(buf[2]);
            union(u,v);
        }
        System.out.println(count);
    }
    static int find(int p){
        while(id[p]!=p){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    static void union(int p, int q){
        int i = find(p), j = find(q);
        if(i==j) return;
        id[j]=i;
        count--;
    }
}

