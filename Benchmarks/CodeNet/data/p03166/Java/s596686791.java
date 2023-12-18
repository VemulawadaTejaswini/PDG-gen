import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main
{
    int visited[];
    List<List<Integer>> graph;
    int path[];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        // System.out.print(V+" "+E);
        Main object=new Main();
        sc.nextLine();
        object.graph = new ArrayList<List<Integer>>();
        for (int i = 0; i < V; i++) {
            object.graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < E; i++) {
            object.graph.get(sc.nextInt()-1).add(sc.nextInt());
            sc.nextLine();
        }
        object.visited = new int[V];
        object.path= new int[V];
        
        int max=0;
        for(int i=1;i<=V;i++)
        {
             max=(int)Math.max(max,object.neigh(i));
            // System.out.print(max+" ");
        }
        System.out.println(max);
        sc.close();
     }

     public int neigh(int n)
      {
          int max=0;
         if(visited[n-1]==1)
           return(path[n-1]);
         for(int i=0;i<graph.get(n-1).size();i++)
         {
            max=(int)Math.max(max,1+neigh(graph.get(n-1).get(i)));
         }
         visited[n-1]=1;
         path[n-1]=max;
         return(max);
     }
}