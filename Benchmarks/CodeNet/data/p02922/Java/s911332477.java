import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count = 0;
    int result=0;
    while(true){
      result=(N-1)+(N*count);
      count++;
      if(result>=M){
       break;
      }
  }
    System.out.println(count);
  }
}