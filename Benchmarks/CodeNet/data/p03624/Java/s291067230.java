import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    for(char c = 'a';c <= 'z';c++){
      boolean found = false;
      for(int i = 0;i < s.length();i++){
        char ch[] = s.toCharArray();
        if(ch[i] == c){
          found = true;
        }
      }
      if(!found){
        System.out.println(c);
        return;
      }
    }
    System.out.println("None");
  }
}
