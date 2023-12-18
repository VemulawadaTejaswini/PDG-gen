import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean c1 = false, c2 = false, c3 = false;
    if(a == 1 || b == 1){
      c1 = true;
    }
    if(a == 2 || b == 2){
      c2 = true;
    }
    if(a == 3 || b == 3){
      c3 = true;
    }
    
    int ans = 0;
    if(c1 && c2){
      ans = 3;
    }else if(c2 && c3){
      ans = 1;
    }else{
      ans = 2;
    }
    System.out.println(ans);
  }
}