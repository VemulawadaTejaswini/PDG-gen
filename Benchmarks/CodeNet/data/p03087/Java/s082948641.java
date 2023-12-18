import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];
    for(int i=0; i<q; i++){
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    //部分文字列のAC検出用
    int at = 'A'-'C'; 

    //文字を隣同士で引き算をする
    int[] calc = new int[n];
    for(int i=1; i<n; ++i){
      calc[i] = s.charAt(i-1) - s.charAt(i);
    }

    //lからrの間に'AC'があるかどうか調べる
    for(int j=0; j<q; ++j){
      int ans=0;
      for(int i=l[j]; i<r[j]; ++i){
        if(calc[i] == at) ++ans;
      }
      System.out.println(ans);
    }
  }
}