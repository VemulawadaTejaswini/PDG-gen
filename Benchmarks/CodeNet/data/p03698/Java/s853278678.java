import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] s = scan.nextLine().split("");
    Map<String,Integer> map = new HashMap<>();
    
    int flg = 0;
    for(int i = 0;i<s.length;i++){
      if(map.get(s[i]) != null){
        flg++;
        System.out.println("no");
        break;
      }else{
        map.put(s[i],1);
      }
    }
    if(flg == 0){
      System.out.println("yes");
    }
        
  }
}
    