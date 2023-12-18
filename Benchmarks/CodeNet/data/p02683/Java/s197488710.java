import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    
    // n冊 * (価格を入れる用の1個 + m個のアルゴリズム) の配列を用意
    int[][] arry = new int[n][m + 1];
    
    for (int i = 0; i < n; i++){
      for (int j = 0; j < m + 1; j++) {
        arry[i][j] = sc.nextInt();
      }
    }
    
    sc.close();
    
    int answer = -1;
    
    // この回答だと本が2冊までしか計算できないので間違っている
    
    for (int i = 0; i < n - 1; i++) {
      
      for (int j = i + 1; j < n; j++) {
        boolean allOverX = true;
      	// 価格を除いて1始まり
      	for (int k = 1; k < m + 1; k++){
          int temp = arry[i][k] + arry[j][k];
          System.out.println(temp);
          if (temp < x) {
          	allOverX = false;
          }
      	}
      	// 全てX以上なら結果に価格を格納する
      	if (allOverX) {
          int tempAnswer = arry[i][0] + arry[j][0];
          // 初回の解答以外の場合は値が小さい場合のみ代入する
          if (answer == -1 || answer > tempAnswer) {
            answer = tempAnswer;            
          }
      	}
      }
    }   
    
    System.out.println(answer);
    
  }
}