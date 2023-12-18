import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[] alp = new int[26];
    for(int i = 0; i < S.length(); i++){
      char c = S.charAt(i);
      alp[c-'a']++;
    }
    for(int i = 0; i < 26; i++){
      if(alp[i] == 0){
        System.out.println((char)(i + 'a'));
        return;
      }
    }
    System.out.println("None");
  }
}