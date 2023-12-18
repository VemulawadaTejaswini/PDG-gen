import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] val = new int[n];
    
    for(int i = 0; i < n; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    
    long ans = 0;
    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        if(i != j){
          ans += (val[i] * val[j]);
        }
      }
    }
    System.out.println(ans);
  }
}