import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    for(int i=0;(a+(a-1)*i)<b;i++){
      ans = i+1;
    }
    System.out.println(ans);
  }
}
