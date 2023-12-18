import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count = 0;
    int len = S.length();
    String NS = S;
    while(true){
      int nl = NS.length();
      NS = NS.replace("0011","");
      NS = NS.replace("1100","");
      NS = NS.replace("0101","");
      NS = NS.replace("1010","");
      NS = NS.replace("01","");
      NS = NS.replace("10","");
      if(NS.length() == nl)break;
    }
    System.out.println(len-NS.length());
  }
}
