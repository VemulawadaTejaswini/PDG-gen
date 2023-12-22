import java.util.Scanner;
public class Main{
    int ans_dict,num_of_stations,num_of_routes;
    int[][] node;
    boolean[][] visited;
    String ans_routes;
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            num_of_stations = sc.nextInt();
            num_of_routes = sc.nextInt();
            if(num_of_stations == 0 && num_of_routes == 0){
                break;
            }
            node = new int[num_of_stations+1][num_of_stations+1];
            for(int i = 0;i < num_of_routes;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int len = sc.nextInt();
                node[a][b] = len;
                node[b][a] = len;
            }
            ans_routes = "";
            
            /*
              for(int i = 0;i < num_of_stations+1;i++){
              for(int ii = 0;ii < num_of_stations+1;ii++){
              System.out.print(node[i][ii] + " ");
              }
              System.out.println();
              }
            */
            visited = new boolean[num_of_stations+1][num_of_stations+1];
            for(int i = 1;i < num_of_stations + 1;i++){
                for(int ii = 1;ii < num_of_stations + 1;ii++){
                    visited[i][ii] = node[i][ii] > 0;
                }
            }
            for(int cur_node = 1;cur_node < num_of_stations + 1;cur_node++){
                DFS(cur_node,""+cur_node,0);
            }
            System.out.println(ans_dict);
            System.out.println(ans_routes);
          
        }
    }
    void DFS(int cur_node,String routes,int total_dist){
        //System.out.println(cur_node+" "+routes+" "+total_dist);
        if(ans_dict == total_dist){
            ans_routes = ans_routes.compareTo(routes) < 0 ? ans_routes : routes;
        }
        if(ans_dict < total_dist){
            ans_routes = routes;
            ans_dict = total_dist;
        }
        for(int next_node = 1;next_node < num_of_stations + 1;next_node++){
            //System.out.println(next_node+" "+visited[cur_node][next_node]);
            if(visited[cur_node][next_node]){
                visited[cur_node][next_node] = false;
                visited[next_node][cur_node] = false;
                DFS(next_node,routes+" "+next_node,total_dist+node[cur_node][next_node]);
                visited[cur_node][next_node] = true;
                visited[next_node][cur_node] = true;
            }
        }
    }
    public static void main(String[] args){
        new Main().run();
    }
}