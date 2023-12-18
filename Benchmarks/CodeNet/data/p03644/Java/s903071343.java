import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double max = 1;
    
    if(N == 1){
      max = 2;
    }else{
      for (int i = 0; i < N; i++){
        max = Math.pow(2, i);
        if (max > N){
          break;
        }
      }
    }
    max = max / 2;
    int answer = (int)max;
    
    System.out.println(answer);
  }
}