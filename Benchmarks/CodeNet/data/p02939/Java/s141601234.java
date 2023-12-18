import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    int count = 1;
    int max = 0;
    for(int i = 0; i < s.length-1; i++) {
     if(s[i]==s[i+1]) {
        i++;
      }
    count++;
    }
    System.out.println(count);
    
  }    
}