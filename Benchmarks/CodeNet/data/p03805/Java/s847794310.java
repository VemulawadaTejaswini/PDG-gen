import java.util.Scanner;
 
public class Main {
  int N,M;
  int[][] e;
  
  int calc(int k, boolean[] f) {
    if (check(f)) {
      return 1;
    }
    int ret = 0;
	  for (int i = 0; i <N; i++) {
	    if (e[k][i] == 1 && !f[i]) {
		  f[i] = true;
		  ret += calc(i, f);
		  f[i] = false;
		}
	  }
	  return ret;
	}
 
	boolean check(boolean[] f) {
      for (int i = 0; i <N; i++) {
	    if (!f[i]) {
          return false;
		}
	  }
	  return true;
	}
  
  void run() {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();  
    M = sc.nextInt();
    e = new int[N][N];
	for (int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      e[a][b] = e[b][a] = 1;
    }
	boolean[] f = new boolean[N];
	f[0] = true;
	System.out.println(calc(0, f));
	}
  
  public static void main(String[] args) {
    new Main().run();
  }
  
}