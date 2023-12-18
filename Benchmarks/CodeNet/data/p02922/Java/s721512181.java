import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count = 0;
    int result=0;
    while(true){
      result=(N*count)+(N-(count-1));
      if(result>=M){
       break;
      }
       count++;
  }
    System.out.println(count+1);
  }
}