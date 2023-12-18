import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int ans = 0;
    for (int i = 1; i < n+1; i++){
      int temp = 0;
      while (i > 0){
        temp += i%10;
        i /= 10;
      }
      if (a <= temp && temp <= b){ans += i;}
    }
    System.out.println(ans);
  }
}