import java.util.*;

public class Main {

  public static void main(String args[]) {
    int rep = 1;
    if( args.length > 0 ) { rep = Integer.parseInt(args[0]); }
    (new Main()).__solve(rep);
  }

  void __solve(int rep) {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

      for( int i = 0; i < rep; ++i ) {
        __solve(cin);
      }

    }

  }

  void __solve(Scanner cin) {
	  int N = cin.nextInt();
	  List<int[]> all[] = new List[N];
	  for( int i = 0; i < N; ++i ) {
		  all[i] = new ArrayList<int[]>();
	  }
	  for( int i = 0; i < N - 1; ++i ) {
		  int v = cin.nextInt() - 1;
		  int u = cin.nextInt() - 1;
		  int d = cin.nextInt() & 1;
		  all[u].add(new int[] { v, d });
		  all[v].add(new int[] { u, d });
	  }
	  int ans[] = new int[N];
	  boolean vis[] = new boolean[N];
	  int queue[] = new int[N];
	  int q = 0;
	  queue[q++] = 0;
	  vis[0] = true;
	  for( int i = 0; i < q; ++i ) {
		  int cur = queue[i];
		  for( int edge[] : all[cur] ) {
			  // parent;
			  if( vis[ edge[0] ] ) { continue; }
			  vis[ edge[0] ] = true;
			  ans[ edge[0] ] = ans[cur] ^ edge[1];
			  queue[q++] = edge[0];
		  }
	  }
	  for( int i = 0; i < N; ++i ) {
		  System.out.println(ans[i]);
	  }
  }

}
