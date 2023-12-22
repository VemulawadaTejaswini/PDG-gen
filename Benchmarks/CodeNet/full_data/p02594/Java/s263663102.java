import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class Main {
 
	static int ans;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n >= 30) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
	
	//return gcd O(logN)
    public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
    
  //return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
    public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
    
    //return root node idx O(a(N)) ( O(1)<O(a(N))<O(logN) )
    public static int find(int[] tree,int idx) {
        if(tree[idx]==idx) return idx;
        else return tree[idx] = find(tree,tree[idx]);
    }

    //union idx2 tree to idx1 tree O(a(N))
    public static void union(int[] tree,int idx1,int idx2) {
        int root1 = find(tree,idx1);
        int root2 = find(tree,idx2);
        tree[root2] = root1;
    }
    
  //add value at idx on bit O(logN)
    public static void add(int[] bit,int idx,int value) {
        for(int i=idx;i<bit.length;i+=(i&-i)) bit[i] += value;
    }

    //return sum [1,idx] O(logN)
    public static int sum(int[] bit,int idx) {
        int ret = 0;
        for(int i=idx;i>0;i-=(i&-i)) ret += bit[i];
        return ret;
    }
    
  //return min distance from start to end O(ElogV) (negative cost is prohibited)
    //edge is int[3] array {from,to,cost}
    //edges is edge list from specific node
    //all_edges is Map<from node number,edges>
    public static int dijkstra(Map<Integer,List<int[]>> all_edges,int start,int end,int max_node_number) {
        int[] distance = new int[max_node_number+1];
        for(int i=0;i<distance.length;i++) distance[i] = -1;
        PriorityQueue<int[]> p_que = new PriorityQueue<>((a,b)->((distance[a[0]]+a[2])-(distance[b[0]]+b[2])));
        distance[start] = 0;
        List<int[]> edges = all_edges.get(start);
        for(int i=0;i<edges.size();i++) p_que.add(edges.get(i));
        while(distance[end]<0) {
            int[] nearest_edge = p_que.poll();
            if(distance[nearest_edge[1]]<0) {
                distance[nearest_edge[1]] = distance[nearest_edge[0]] + nearest_edge[2];
                if(all_edges.containsKey(nearest_edge[1])) {
                    edges = all_edges.get(nearest_edge[1]);
                    for(int i=0;i<edges.size();i++) {
                        int[] edge = edges.get(i);
                        if(distance[edge[1]]<0) p_que.add(edge);
                    }
                }
            }
        }
        return distance[end];
    }
    
  //return min distance from start to end O(EV) (negative cost is possible)
    //edge is int[3] array {from,to,cost}
    //edges is edge list from specific node
    //all_edges is Map<from node number,edges>
    public static int bellmanFord(Map<Integer,List<int[]>> all_edges,int start,int end,int max_node_number) {
        int[] distance = new int[max_node_number+1];
        int INF = Integer.MAX_VALUE;
        for(int i=0;i<distance.length;i++) {
            distance[i] = INF;
        }
        distance[start] = 0;
        int counter = all_edges.size();
        while(counter>0) {
            boolean updated = false;
            for(List<int[]> edges: all_edges.values()) {
                if(distance[edges.get(0)[0]]==INF) continue;
                for(int[] edge: edges) {
                    if(distance[edge[0]]+edge[2] < distance[edge[1]]) {
                        distance[edge[1]] = distance[edge[0]]+edge[2];
                        updated = true;
                    }
                }
            }
            if(!updated) break;
            counter--;
        }
        return counter==0?Integer.MIN_VALUE:distance[end];
    }
    
  //return new distance matrix O(logV^3)
    public static int[][] warshallFloyd(int[][] distance){
        int node_number = distance.length;
        int[][] min_distance = new int[node_number][node_number];
        for(int i=0;i<node_number;i++) {
            for(int j=0;j<node_number;j++) {
                min_distance[i][j] = distance[i][j];
            }
        }
        for(int via=0;via<node_number;via++) {
            for(int from=0;from<node_number;from++) {
                for(int to=0;to<node_number;to++) {
                    min_distance[from][to] = Math.min(min_distance[from][to], min_distance[from][via]+min_distance[via][to]);
                }
            }
        }
        return min_distance;
    }
    
    
  //return min cost for union all nodes O(ElogV)
    //edge is int[3] array {node1,node2,cost}
    //edges is edge list
    public static int kruskal(List<int[]> edges,int max_node_number) {
        edges.sort((a,b)->(a[2]-b[2]));
        int[] uft = new int[max_node_number+1];
        for(int i=0;i<uft.length;i++) {
            uft[i] = i;
        }
        int cost_sum = 0;
        for(int[] edge: edges) {
            if(find_krusk(uft,edge[0])!=find_krusk(uft,edge[1])) {
                union_krusk(uft,edge[0],edge[1]);
                cost_sum += edge[2];
            }
        }
        return cost_sum;
    }

    public static int find_krusk(int[] tree,int idx) {
        if(tree[idx]==idx) return idx;
        else return tree[idx] = find(tree,tree[idx]);
    }

    public static void union_krusk(int[] tree,int idx1,int idx2) {
        int root1 = find(tree,idx1);
        int root2 = find(tree,idx2);
        tree[root2] = root1;
    }
}