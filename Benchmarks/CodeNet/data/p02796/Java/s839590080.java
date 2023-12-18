import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int n = Integer.parseInt(sc.next());
    int x[] = new int[n];
    int length[] = new int[n];
    int count[] = new int[n];
    for(int i=0;i<n;i++){
      x[i] = Integer.parseInt(sc.next());
      length[i] = Integer.parseInt(sc.next());
      count[i] = 0;
    }

    int maxKill = 1;
    int delNum = 0;

    while(true){
      // 一台ずつ腕伸ばせる範囲に何台ロボットあるか数える
      for(int i=0; i<n; i++){
        int min = x[i] - length[i];
        int max = x[i] + length[i];
        // System.out.println("min:" + min);
        // System.out.println("max:" + max);
        // 範囲内にロボットあればインクリメント
        for(int j=0; j<n; j++){
          if(x[j] + length[j] > min && x[j]-length[j] < max){
            count[i]++;
          }
        }
        // 殺した数が多ければ暫定一位
        // System.out.println("kill:" + count[i]);
        if(maxKill < count[i]){
          maxKill = count[i];
          delNum = i;
        }
      }
      // System.out.println(n);
      if(maxKill == 1){
        break;
      }
      // 一番多く殺してたロボットを除外。詰める。
      for(int i=delNum; i<n-1; i++){
        x[i] = x[i+1];
        length[i] = length[i+1];
      }
      n--;
      maxKill = 1;
      for(int i=0; i<n; i++){
        count[i] = 0;
      }
    }
    System.out.println(n);
  }
}
