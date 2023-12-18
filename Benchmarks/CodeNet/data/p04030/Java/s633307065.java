import java.util.*;
 
public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String k = null;
    List<String> ans = new ArrayList<String>();
    
    for(int i = 0; i < str.length(); i++) {
      k = str.substring(i, i+1);
      
      if(k.equals("0")){
        ans.add("0");
      }else if(k.equals("1")){
        ans.add("1");
      }else if(k.equals("B")){
        if(ans.size() > 0){
          ans.remove(ans.size()-1);
        }
      }
    }
      
    for(int j=0; j<ans.size(); j++){
      System.out.print(ans.get(j));
    }
  }
}