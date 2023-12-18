import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int max = 0;

    for(int i = 0 ; i < n ; ++i){
      int l = sc.nextInt();
      sum += l;
      max = Math.max(max,l);
    }
    
    if(max < sum-max){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}