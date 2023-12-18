import java.util.*;

class Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int ans = 0;
    for(int i = 0;i < a;i++){
      ans+=i+1;
    }
    System.out.println(ans);
  }
}
