import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int cnt = 0;
    
    for(int i=1; i <= n; i++){
      int a = sc.nextInt();
      if(i%2 == 0)
        continue;
      if(a%2 == 0)
        continue;
      cnt++;
    }
    
    System.out.println(cnt);
  }
}