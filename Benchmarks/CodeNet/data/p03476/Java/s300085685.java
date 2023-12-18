import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      int Q = sc.nextInt();
      int[][] q = new int[Q][2];
      for(int i=0; i<Q; i++){
        q[i][0] = sc.nextInt();
        q[i][1] = sc.nextInt();
      }	
      //1~99999の中で、「2017」に似ていれば1、そうでなければ0のリストを生成する
      //配列[i]に対し、i*2+1 へ判定を行う。 例：i=0, 1  i=5 11
      int[] near = new int[50000];
      for(int i=0; i<near.length; i++) {
    	  int num = i * 2 + 1;
    	  near[i] = isNear2017(num);
      }
      //累積和のリストを生成
      //ruiseki[i] = near[i-1]までの合計
      int[] ruiseki = new int[50001];
      ruiseki[0] = 0;
      for(int i=0; i< near.length; i++) {
    	  ruiseki[i + 1] = ruiseki[i] + near[i];
      }
      
      for(int i=0; i<Q; i++) {
    	  int left = q[i][0] / 2;
    	  int right = q[i][1] / 2 + 1;
    	  int ans = ruiseki[right] - ruiseki[left];
    	  System.out.println(ans);  	  
      }
      
	}
	//Nが「2017に似ている」かどうかを調べる。似ていれば１、そうでなければ０を返す
    public static int isNear2017(int n) {
    	int r = 1;
    	int nPlus = (n + 1)/2;
    	for(int i=2; i<nPlus; i++) {
    		if(r == 0) break;
    		if(n%i==0)  r = 0;
    		if(nPlus%i==0) r=0;
    	}
    	for(int i= nPlus; i<n; i++) {
    		if(r == 0) break;
    		if(n%i==0) r=0;
    	}
    	return r;
    }
}