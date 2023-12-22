import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int V;
	public static ArrayList<Edge> G[];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        V = scanner.nextInt();

        G = new ArrayList[V];
        for(int i = 0; i < V; i++){

            G[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < V; i++){

            int node_id = scanner.nextInt();
            int num_adj = scanner.nextInt();

            for(int loop = 0; loop < num_adj; loop++){

                G[node_id].add(new Edge(scanner.nextInt(),scanner.nextInt()));
            }
        }

        int min_dist[] = new int[V];

        min_dist[0] = 0;
        for(int i = 1; i < V; i++){

            min_dist[i] = BIG_NUM;
        }

        PriorityQueue<Info> Q = new PriorityQueue<Info>();
        int next_node,next_dist;

        Q.add(new Info(0,0));

        while(!Q.isEmpty()){

            if(Q.peek().sum_dist > min_dist[Q.peek().node_id]){

                Q.poll();

            }else{

                for(int i = 0; i < G[Q.peek().node_id].size(); i++){

                    next_node = G[Q.peek().node_id].get(i).to;
                    next_dist = Q.peek().sum_dist+G[Q.peek().node_id].get(i).cost;

                    if(min_dist[next_node] <= next_dist)continue;

                    min_dist[next_node] = next_dist;
                    Q.add(new Info(next_node,next_dist));
                }

                Q.poll();
            }
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < V; i++){

            ans.append(Integer.toString(i)).append(" ").append(Integer.toString(min_dist[i])).append("\n");
        }

        System.out.print(ans.toString());
    }
}

class Edge{

    public int to;
    public int cost;

    Edge(int arg_to,int arg_cost){
        this.to = arg_to;
        this.cost = arg_cost;
    }
}

class Info implements Comparable<Info>{

    public int node_id;
    public int sum_dist;

    Info(int arg_node_id,int arg_sum_dist){
        this.node_id = arg_node_id;
        this.sum_dist = arg_sum_dist;
    }

    public int compareTo(Info arg){
        if(this.sum_dist < arg.sum_dist)return -1;
        if(this.sum_dist > arg.sum_dist)return 1;
        return 0;
    }
}

class UTIL{

    //String→intへ変換
    public static int getNUM(String tmp_str){

        return Integer.parseInt(tmp_str);
    }

    //文字が半角数字か判定する関数
    public static boolean isNumber(String tmp_str){

        if(tmp_str == null || tmp_str.length() == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
        return matcher.matches();
    }
}
