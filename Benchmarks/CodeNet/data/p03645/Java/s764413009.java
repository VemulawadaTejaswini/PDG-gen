import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
        int[][] sp = new int[M][2];
        int cnt1 = 0;
        int cnt2 = 0;
		for(int i=0; i<M; i++){
          int start = sc.nextInt();
          int end   = sc.nextInt();
          if(start == 1){
            sp[cnt1][0] = end;
            cnt1++;
          }
          else if(end == N){
            sp[cnt2][1] = start;
            cnt2++;
          }
        }
        //sp[cnt1][0] = -1;
        //sp[cnt2][1] = -1;
      
        for(int i=0; i<cnt1; i++){
          //if(sp[i][0] != -1) break;
          // if(sp[i][0] != 1) continue;
          for(int j=0; j<cnt2; j++){
            //if(sp[j][1] != -1) break;
            // if(sp[i][1] != sp[j][0]) continue;
            if(sp[i][0] == sp[j][1]) {
              System.out.print("POSSIBLE");
              return;
            }
          }
        }
        System.out.print("IMPOSSIBLE");
	}
}
