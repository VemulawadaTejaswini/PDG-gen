import java.util.*;
public class Main{
  public static void main(String[] args){
    //ここから入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k[] = new int[m];
    int s[][] = new int[m][n];
    for(int i = 0;i<m;i++){
      k[i] = sc.nextInt();
      for(int j = 0;j<k[i];j++){
        s[i][j] = sc.nextInt();
      }
    }
    int p[] = new int[m];
    for(int i = 0;i<m;i++){
      p[i] = sc.nextInt();
    }
    //電気つけます
    int pochi = 1;
    int ss[] = new int[n];
    for(int i = 0;i<n;i++){
      ss[i] = pochi;
      pochi *= 2;
    }
    int count = 0;
    for(int i = 0;i<pochi;i++){//スイッチの組み合わせ
      int light = 0;
      //このへんとか
      for(int j = 0;i<m;i++){//電球一個ずつ確認
        //このへんを作りこんだらたぶんいけるで
      }
      if(light == m){//全ての電球が点灯していれば、count++
        count++;
      }
    }
  }
}
