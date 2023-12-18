import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    
    for(int i=0;i<(a*3+b)/2;i++){
      ans++;
    }
    System.out.println(ans);
  }
}