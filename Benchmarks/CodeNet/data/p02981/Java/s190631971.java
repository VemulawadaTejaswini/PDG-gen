import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int train = N*A;
    int taxi = B; 
 
    if(train - taxi >0){
      System.out.println(taxi);
    } else {
      System.out.println(train);
    }
    
  }
}