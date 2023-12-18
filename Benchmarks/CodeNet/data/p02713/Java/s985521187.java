import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    int number = a.nextInt();
    int sum = 0;
    for(int i = 1; i <= number; i++){
        for(int j = 1; j <= number; j++){
            for(int k = 1; k <= number; k++){
                sum+=GCD(i, j, k);
            }
        }
    }
    System.out.println(sum);
  }
  
  
  static int GCD(int a, int b, int c){
      int max = Integer.MIN_VALUE;
      
      for(int i = 1; i <= a; i++){
          if(a == b && b == c){
              max = a;
              return max;
          }
          if(a%i == 0 && b%i == 0 && c%i == 0){
              max = i;
          }
      }
      return max;
  }
}