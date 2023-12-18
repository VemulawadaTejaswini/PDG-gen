import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int c5 = 0;
    int c7 = 0;
    String ans = "NO";
    for(int i = 0;i < 3;i++){
      int que = sc.nextInt();
      if(que == 5)c5++;
      if(que == 7)c7++;
    }
    if(c5 == 2&&c7 == 1)ans = "YES";
  System.out.println(ans);
  }
}