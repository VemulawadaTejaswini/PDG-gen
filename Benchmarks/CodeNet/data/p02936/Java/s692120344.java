import java.util.*;
import static java.lang.System.*;

public class Main{
	 
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);  
	  HashMap<String, List<Integer>> hierarchyMap = new HashMap<>(); 
	  int N = sc.nextInt();
	  int Q = sc.nextInt();
	  long[] scores  = new long[N+10];
	  int maxHierarchy = 0;
	  int[] hierarchy = new int[N+10];
	  int[] parent = new int[N+10];
	  for(int i=1; i<=N; i++) {
		  hierarchy[i] = 1000100;	 
		  List<Integer> list = new ArrayList<>();
		  hierarchyMap.put(String.valueOf(i), list);
	  }
	  
	  hierarchy[1] = 0;  
	  
	  //辺の情報を格納
	  for(int i=0; i<N-1; i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  //親をa,子をbとする
		  if (hierarchy[a] > hierarchy[b]) {
			  int swap = a; a = b; b = swap;
		  }
		  hierarchy[b] = hierarchy[a] + 1;
		  if (maxHierarchy < hierarchy[b]) maxHierarchy = hierarchy[b];
		  parent[b] = a;
		  //子の階層を登録
		  List<Integer> L = hierarchyMap.get(String.valueOf(hierarchy[b]));
		  L.add(b);
		  hierarchyMap.put(String.valueOf(hierarchy[b]), L);
	  }
	  
	  for(int i=0; i<Q; i++) {
		  int p = sc.nextInt();
		  int x = sc.nextInt();
		  scores[p] += x;
	  }
	  
	  
	  //階層ごとに処理
	  for(int i=1; i<=maxHierarchy; i++) {
		  List<Integer> L = hierarchyMap.get(String.valueOf(i));
		  for(int j=0; j<L.size(); j++) {
			  int n = L.get(j);
			  int p = parent[n];
			  scores[n] += scores[p];
		  }
	  }  
	  
	  for(int i=1 ; i<= N; i++) {
		  out.print(scores[i] + " ");
	  }  
	}

  }	