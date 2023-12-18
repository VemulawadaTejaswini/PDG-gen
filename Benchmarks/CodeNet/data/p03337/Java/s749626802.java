import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int result1 = A + B;
    int result2 = A - B;
    int result3 = A * B;
    
    int values [] = {result1,result2,result3};
    int max = values[0];
    
    for(int i = 1; i < values.length;i++){
      max = Math.max(max, values[i]);
    }
    
    System.out.println(max);
    


 
  }
}