import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
      //全提出の個数Nを入力
      int N = sc.nextInt();
     
      //入力内容から4種類を抽出する
      for(int i=0; i<N; i++) {
       //N個分の４種類の配列を入力
       String[] S = {"AC","WA","TLE","RE"};
       //出力個数
       int[] C = {0,0,0,0};
       
       String I = sc.nextLine();
       
       if (I.equals(S[0]) {
        C[0]++;
       } else if (I.equals(S[1]) {
        C[1]++;
       } else if (I.equals(S[2]) {
        C[2]++;
       } else if (I.equals(S[3]) {
        C[3]++;
       }
      }
      for (int i=0; i<4; i++) {
        System.out.println(S[i] + "×" + C[i]);
      }
   }
}
