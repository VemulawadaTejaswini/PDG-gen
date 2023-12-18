import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int temp = N - M;
    int 差 = Math.abs(temp);
    int 多いほう = Math.max(M,N);
    int 少ないほう = Math.min(M,N);
    int answer = 0;
    int temp2 = 多いほう + 1;
    if(差 >= 2){
      System.out.println(0);
    }
    else if(多いほう==少ないほう){
      answer = 階乗(少ないほう)*P(temp2,M)    %1000000007;
      System.out.println(answer);     
    }
    else{
      answer = 階乗(少ないほう)*階乗(多いほう)    %1000000007;
      System.out.println(answer);
    }

  }
  private static int 階乗(int k){
    if(k <= 1){
      return k;
    }
    else{
      return k * 階乗(k - 1);
    } 
  }
  private static int P(int a, int b){
    if (b == 1) {
      return a*b; 
    }
    else{
      return a*P(a-1,b-1);
    }
  }
}