import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    String ans = "No";

    for (int i = 0; i<a+1; i++){
      if((n-i)%500!=0){
        continue;
      }
      else{
        ans="Yes";
        break;
      }
    }
    System.out.println(ans);
  }


}