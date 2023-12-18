import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int counter = 0;

    for(int i = 0; i < 20; i++){
      for(int j = 0; j < A + 1; j++){
        int amount = 500 * i + j;
        if(amount == N){
          counter = 1;
        }
      }
    }

    if(counter == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}