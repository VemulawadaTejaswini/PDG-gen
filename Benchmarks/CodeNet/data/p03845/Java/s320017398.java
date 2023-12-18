import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();//回答時間
    int time[] = new int[N];
    for(int i = 0;i < N;i++){
      time[i] = sc.nextInt();
    }
    int M = sc.nextInt();//ドリンク
    int target[] = new int[M];
    int change[] = new int[M];
    for(int j = 0;j < M;j++){
      target[j] = sc.nextInt() - 1;
      change[j] = sc.nextInt();
    }
    //処理
    int total;
    int normaltotal = 0;
    for(int l = 0;l < N;l++){
      normaltotal += time[l];
    }
    for(int k = 0;k < M;k++){
      total = normaltotal;
      total = total - time[target[k]] + change[k];
      System.out.println(total);
    }

  }
}
