import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = scanner.nextInt();
    }
    
    int negative_count_parity = 0;
    boolean zero_existence = true;
    int greatest_negative = 1;
    long sum = 0;
    for(int i = 0; i < n; i++){
      int ai = a[i];
      if(ai > 0){
        sum += (long)ai;
      }else if(ai == 0){
        zero_existence = true;
      }else{
        if(ai > greatest_negative){
          sum += (long)(-greatest_negative);
          greatest_negative = ai;
          negative_count_parity ^= 1;
        }else if(greatest_negative > 0){
          greatest_negative = ai;
          negative_count_parity ^= 1;
        }else{
          sum += (long)(-ai);
        }
      }
    }
    
    if(zero_existence || negative_count_parity == 0){
      if(greatest_negative < 0){
        sum += (long)(-greatest_negative);
      }
    }
    
    System.out.println(sum);
  }
}
