import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] s = S.toCharArray();
    ArrayList<Character> b = new ArrayList<>();
    
    for(int i = 0; i < s.length; i++){
      if(s[i] == '0'){
        b.add('0');
      }else if(s[i] == '1'){
        b.add('1');
      }else{
        if(b.size() != 0){
           b.remove(b.size()-1);
        }else{
          continue;
        }
      }
    }

    for(int i = 0; i < b.size(); i++){
      System.out.print(b.get(i));
    }
     
    System.out.println();
  }  
}