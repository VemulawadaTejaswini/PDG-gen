import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String ans = "Yes";
    for(int i = 0; i < N; i++){
      String[] s = sc.nextLine().split(" ");
      int t = Integer.parseInt(s[0]);
      int x = Integer.parseInt(s[1]);
      int y = Integer.parseInt(s[2]);
      
      if(t < x+y || t%2 != (x+y)%2 ){
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}