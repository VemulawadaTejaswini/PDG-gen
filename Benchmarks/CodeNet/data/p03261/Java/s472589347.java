import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] w = new String[n];
    for(int i=0;i<n;i++){
      w[i]=sc.next();
    }
     if(check1(w) && check2(w)){
       System.out.println("Yes");
     }else{
       System.out.println("No");
     }
  }    
  static boolean check1(String[] w){
      Set<String> linkedHashSet = new LinkedHashSet<String>();
      for (int i=0;i<w.length;i++) {
       linkedHashSet.add(w[i]);
      }
      Object[] w_after = linkedHashSet.toArray();
      if(w_after.length==w.length){
        return true;
      }else{
        return false;
      }
  }
  static boolean check2(String[] w){
    String e = w[0].substring(w[0].length()-1);
    for(int i=1;i<w.length;i++){
      String f = w[i].substring(0,1);
      if(f.equals(e)){
        e = w[i].substring(w[i].length()-1);
      }else{
        return false;
      }
    }
    return true;
  } 
}