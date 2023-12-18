import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Set<Character> set = new HashSet<>();
    for (char c : S.toCharArray()) {    
      if(set.contains(c)){
        System.out.println("no");
        return;
      }
      set.add(c);
    }
    System.out.println("yes");
  }
}    