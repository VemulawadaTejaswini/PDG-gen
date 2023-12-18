import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
      	Set<String> se = new HashSet<String>();
      	Set<String> se2 = new HashSet<String>();
      for(int i = 0; i< S.length() ; i++){
        se.add(S.substring(i,i+1));
      }
      for(int i = 0; i< T.length() ; i++){
        se2.add(T.substring(i,i+1));
      }
      if(se.size()== (se2.size())){
      System.out.println("Yes");
      } else{
      System.out.println("No");
      }
    }
}