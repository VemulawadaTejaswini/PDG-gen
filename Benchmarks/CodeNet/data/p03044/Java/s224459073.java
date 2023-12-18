import java.util.*;

public class Main {

    public static void dfs(int color, int index, List<Edge> es, ArrayList<Integer> colors,ArrayList<ArrayList<Edge>> nodes){
       if(colors.get(index) != 100)
           return;
       colors.set(index,color);
       ArrayList<Edge> edges = nodes.get(index);
       for(int i = 0;i < edges.size();i++){
           Edge e = edges.get(i);
           if(e == null)
               break;
           if(e.from == index) {
               if (e.weight % 2 == 0){
                   dfs(color, e.to, es, colors,nodes);
               }
               else{
                   dfs(1 - color, e.to,es, colors,nodes);
               }
           }
           else if(e.to == index){
               if(e.weight % 2 == 0){
                   dfs(color,e.from,es,colors,nodes);
               }
               else{
                   dfs(1 - color,e.from,es,colors,nodes);
               }
           }
       }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Edge> edges = new ArrayList<>();
        ArrayList<ArrayList<Edge>> nodes = new ArrayList<>();

        for(int j = 0;j < N + 1;j++)
            nodes.add(new ArrayList<>());

        for(int i = 0;i < N - 1; i++) {
            int u, v;
            long w;
            u = sc.nextInt() - 1;
            v = sc.nextInt() - 1;
            w = sc.nextLong();

            Edge e = new Edge(u,v,w);
            nodes.get(u).add(e);
            nodes.get(v).add(e);

            edges.add(e);
        }
        ArrayList<Integer> colors = new ArrayList<>(Collections.nCopies(N + 1,100));
        dfs(0,edges.get(0).from,edges,colors,nodes);


        for(int i = 0; i < N;i++)
            System.out.println(colors.get(i));
    }



  public static class Edge{
        int from;
        int to;
        long weight;

        Edge(int f,int t,long w){
            from = f;
            to = t;
            weight = w;
        }
    }






    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}



