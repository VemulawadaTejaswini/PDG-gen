import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] S = s.split("");
    String temp =S[0];
    int count = 1;
    int i = 1;
    while(  i < S.length) {
      if(temp.equals(S[i]) && i < S.length-1) {
        temp=S[i]+S[i+1];
        i += 2;
        count++;
      }else if(temp.equals(S[i])) {
        i++;
      }else if(!temp.equals(S[i])) {
        temp = S[i];
        count++;
        i++;
      }
  }
    System.out.println(count);
  }
}