import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int k = sc.nextInt();
    String S = sc.next();
    k--;

    StringBuilder sb = new StringBuilder();
    sb.append(S);
    if(sb.charAt(k)=='A'){
      sb.setCharAt(k, 'a');
    }else if(sb.charAt(k)=='B'){
      sb.setCharAt(k, 'b');
    }else{
      sb.setCharAt(k, 'c');
    }
    System.out.println(sb.toString());
  }
}