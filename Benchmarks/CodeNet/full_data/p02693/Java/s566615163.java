import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int k = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    if(a > b){
      int tmp = a;
      a = b;
      b = tmp;
    }
    boolean ok = false;
    for(int i = a; i < b; i++){
      if(i % k == 0){
        ok = true;
        break;
      }
    }
    if(ok){
      System.out.println("OK");
    } else{
      System.out.println("NG");
    }
  }
    
}