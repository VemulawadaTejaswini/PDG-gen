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
    int check = 1;
    
    //左端処理
    int min = arrayH[0];
    for(int i = 0; i < N; i++){
      if(arrayH[i] < min){
        min = arrayH[i];
      }
    }
    
    if(arrayH[0] == min || arrayH[0] == min + 1){
      check++;
    }
    
    //右端処理
    if(N > 2){
      int max = arrayH[N - 1];
      
      for(int i = 0; i < N; i++){
        if(arrayH[i] > max){
          max = arrayH[i];
        }
      }
    
      if(arrayH[N - 1] == max || arrayH[N - 1] == max - 1){
        check++;
      }
    }
    
    //中央処理
    if(N > 3){
      for(int i = 1; i < N - 2; i++){
        if(arrayH[i + 1] >= arrayH[i]){
          check++;
        } else if(arrayH[i] == arrayH[i + 1] + 1 && arrayH[i + 2] >= arrayH[i + 1]){
          check++;
        }
      }
    }
    
    if(N == check){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
