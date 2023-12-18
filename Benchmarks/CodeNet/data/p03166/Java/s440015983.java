/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package here;

/**
 *
 * @author sokumar
 */
import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<Integer> []hs;
    static boolean []vis;
    static int []level;
    static int []indegree;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        
            int n = sc.nextInt();
            int m = sc.nextInt();
            hs = new ArrayList[n+1];
            level = new int[n+1];
            indegree = new int[n+1];
            for(int i=1;i<=n;i++)
            {
                hs[i] = new ArrayList<>();
            }
            for(int i=0;i<m;i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                hs[u].add(v);
                indegree[v] += 1;
            }
            Queue<Integer> q = new LinkedList<>();
            for(int i=1;i<=n;i++)
            {
                if(indegree[i]==0)
                    q.add(i);
            }
            while(!q.isEmpty())
            {
                int j = q.poll();
                for(int i=0;i<hs[j].size();i++)
                {
                    indegree[hs[j].get(i)]--;
                    level[hs[j].get(i)] = Math.max(level[j]+1, level[hs[j].get(i)]);
                    if(indegree[hs[j].get(i)]==0)
                        q.add(hs[j].get(i));
                }
            }
            int max = Integer.MIN_VALUE;
            for(int i=1;i<=n;i++)
            {
                max = Math.max(max, level[i]);
            }
            w.println(max);
            
            
        w.close();
    }
    
    
}
