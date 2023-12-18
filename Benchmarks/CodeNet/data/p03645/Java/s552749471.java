import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
        int[][] sp = new int[M][2];
		for(int i=0; i<M; i++){
          sp[i][0] = sc.nextInt();
          sp[i][1] = sc.nextInt();
        }
        for(int i=0; i<M; i++){
          if(sp[i][0] != 1) continue;
          for(int j=0; j<M; j++){
            if(sp[i][1] != sp[j][0]) continue;
            if(sp[j][1] == N) {
              System.out.print("POSSIBLE");
              return;
            }
          }
        }
        System.out.print("IMPOSSIBLE");
	}
}
