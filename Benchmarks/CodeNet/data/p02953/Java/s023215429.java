import java.util.*;

public class Main{
  public static void main(String args[]){
    //入力
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    
    int[] arrayH = new int[N];
    for(int i = 0; i < N; i++){
      arrayH[i] = scanner.nextInt();
    }
    
    //処理
    int check = 0;
    
    //左端処理
    int min = 1;
    for(int i = 0; i < N; i++){
      if(arrayH[i] < min){
        min = arrayH[i];
      }
    }
    
    if(arrayH[0] == min){
      check++;
    }
    
    //右端処理
    int max = 1;
    if(N > 2){
      for(int i = 0; i < N; i++){
        if(arrayH[i] > max){
          max = arrayH[i];
        }
      }
    
      if(arrayH[N - 1] == max){
        check++;
      }
    }
    
    //中央処理
    if(N > 3){
      for(int i = 1; i < N - 2; i++){
        if(arrayH[i] >= arrayH[i + 1] - 1 && arrayH[i] - 1 <= arrayH[i + 1]){
          check++;
        }
      }
    }
    
    if(N - 1 == check){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
