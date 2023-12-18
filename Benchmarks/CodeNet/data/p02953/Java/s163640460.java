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
    String result = "Yes";
    int max = 0;
    
    for(int i = 0; i < N; i++){
      if(max - arrayH[i] >= 2){
        result = "No";
      }
      
      if(arrayH[i] > max){
        max = arrayH[i];
      }
    }
    
    System.out.println(result);
  }
}
