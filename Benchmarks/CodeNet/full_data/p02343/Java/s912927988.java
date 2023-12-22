import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{
    
    public static class CDisjointSet {
        public static int rank[];
        public static int p[]; //data
        
        CDisjointSet(int size){
            rank = new int[size];
            p = new int[size];
            for(int i=0; i<size;i++)makeSet(i);
        }
        
        public static void makeSet(int x){
            p[x] = x;
            rank[x] = 0;
        }
        
        public static boolean same(int x, int y){
            return findSet(x) == findSet(y);
        }
        
        public static void unite(int x, int y){
            link(findSet(x),findSet(y));
        }
        
        public static void link(int x, int y){
            if(rank[x] > rank[y]){
                p[y] = x;    
            }else{
                p[x] = y;
                if (rank[x] == rank[y]){
                    rank[y]++;    
                }
            }
        }
        
        public static int findSet(int x){
            if (x != p[x]){
                p[x] = findSet(p[x]);
            }
            return p[x];
        }    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // size
        int q = in.nextInt(); // query size
       
        CDisjointSet ds = new CDisjointSet(n);

        for (int i = 0; i < q; i++){
            int t = in.nextInt(); // query
            int a = in.nextInt(); // query arg1
            int b = in.nextInt(); // query arg2  
            
            if (t == 0)ds.unite(a,b);
            else if(t==1){
                if(ds.same(a,b)) System.out.println("1");
                else System.out.println("0");
            }
        }
     
    }
}