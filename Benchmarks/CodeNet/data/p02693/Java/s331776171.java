import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int k = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    boolean ok = false;
    for(int i = a; i < b; i++){
      if(k % i == 0){
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