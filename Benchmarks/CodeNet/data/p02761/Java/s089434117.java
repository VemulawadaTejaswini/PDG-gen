import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] digits = new int[m];
    int[] numbers = new int[m];
    int[] output = new int[n];
    for(int i = 0; i < m; i++){
      digits[i] = sc.nextInt();
      numbers[i] = sc.nextInt();
    }
    boolean bl = true;
    for(int i = 0; i < m; i++){
      if(digits[i] == 1 && numbers[i] == 0 && n != 1){
        bl = false;
      }
      for(int j = i + 1; j < m; j++){
        if(digits[i] == digits[j] && numbers[i] != numbers[j]){
          bl = false;
        }
      }
      output[digits[i] - 1] = numbers[i];
    }
    if(!bl){
      System.out.println(-1);
    }else if(output[0] == 0 && n == 1){
      System.out.println(0);
    }else if(output[0] == 0){
      int num = (int)(1 * Math.pow(10, n - 1));
      for(int i = 1; i < n; i++){
        num += output[i] * Math.pow(10, n - 1 - i);
      }
      System.out.println(Math.round(num));
    }else{
      int num = 0;
      for(int i = 0; i < n; i++){
        num += output[i] * Math.pow(10, n - 1 - i);
      }
      System.out.println(Math.round(num));
    }
  }
}