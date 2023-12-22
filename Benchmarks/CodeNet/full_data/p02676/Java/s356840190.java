import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    StringBuilder sb = new StringBuilder(sc.next());
    if(sb.length() <= K){
      System.out.print(sb.toString());
    }else{
      System.out.print(sb.substring(0, K).toString() + "...");
    }
  }
}
