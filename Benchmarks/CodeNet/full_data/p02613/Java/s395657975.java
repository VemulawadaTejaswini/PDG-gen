import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
      //全提出の個数Nを入力
      int N = sc.nextInt();
      //N個分の４種類の配列を入力
      String S[] = new String[N];
      for(int i=0; i<N; i++){
      S[i] = sc.next();
      }
     
      String AC = "AC";
      String WA = "WA";
      String TLE = "TLE";
      String RE = "RE";
     
       int C0 = 0;
       int C1 = 0;
       int C2 = 0;
       int C3 = 0;
       //int N = C0 + C1 + C2 + C3;
     
      //入力内容から4種類を抽出する
      for(int i=0; i<N; i++) {
       if (S[i] == "AC") {
        C0 ++;
        System.out.println("AC ×" + C0);
       } else if (S[i] == "WA") {
        C1 ++;
        System.out.println("WA ×" + C1);
       } else if (S[i] == "TLE") {
        C2 ++;
        System.out.println("TLE ×" + C2);
       } else if (S[i] == "RE") {
        C3 ++;
        System.out.println("RE ×" + C3);
       } else {
         continue;
       }
      }
   }
}