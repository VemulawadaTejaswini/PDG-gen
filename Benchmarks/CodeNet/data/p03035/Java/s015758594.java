import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans[] = {b, b/2, 0};
    int i = 1;
    if (a >= 13){
      i--;
    }else if (a <= 5){
      i++;
    }
    System.out.println(ans[i]);
  }
}
