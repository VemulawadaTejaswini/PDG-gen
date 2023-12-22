import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int H = sc.nextInt();
      	int W = sc.nextInt();
      	int M = sc.nextInt();
      	int[] h = new int[M];
      	int[] w = new int[M];
      	int[] H1 = new int[H+1];
      	int[] W1 = new int[W+1];
      	boolean[][] map = new boolean[H+1][W+1];
      	int hpos = 0;
      	int wpos = 0;
      	boolean flag = false;
      	for(int i=0;i<M;i++){
          h[i] = sc.nextInt();
          w[i] = sc.nextInt();
          H1[h[i]]++;
          W1[w[i]]++;
          map[h[i]][w[i]] = true;
          if( H1[h[i]] > H1[hpos] ){
            hpos = h[i];
          }
          if( W1[w[i]] > W1[wpos] ){
            wpos = w[i];
          }
        }
      	long ans = H1[hpos]+W1[wpos];
      	if( map[hpos][wpos] ){
          ans -= 1;
        }
      	System.out.println(ans);	
	}
}