import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a_sum;
    int b_sum;
    int min = 100000000;

    for(int i = 1 ; i < n ; ++i){
      int a = i;
      int b = n-i;
      a_sum = 0;
      b_sum = 0;
      
      while(n>0){
        a_sum += a%10;
        a = (a-a%10)/10;
        if(a==0) break;
      }
      while(n>0){
        b_sum += b%10;
        b = (b-b%10)/10;
        if(b==0) break;
      }
      
      min = Math.min(min,a_sum+b_sum);
      
      
    }

    System.out.println(min);
    
  }
}