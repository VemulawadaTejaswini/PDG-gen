import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    Map<Character, Character> map1 = new HashMap<>();
    Map<Character, Character> map2 = new HashMap<>();
    String ans = "Yes";
    for(int i = 0; i < S.length(); i++){
      char c1 = S.charAt(i);
      char c2 = T.charAt(i);
      if(map1.containsKey(c1)){
        if(map1.get(c1) != c2){
          ans = "No";
          break;
        }
      }else if(map2.containsKey(c2)){
        if(map2.get(c2) != c1){
          ans = "No";
          break;
        }
      }
      map1.put(c1, c2);
      map2.put(c2, c1);
    }
    System.out.println(ans);
  }
}