import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    n = Integer.parseInt(sc.next());
    List<String> L = new ArrayList<String>();
    String s,last = new String();
    boolean b = true;
    
    L.add(sc.next());
    for(int i=1; i<n; i++){
      last = L.get(L.size()-1); s = sc.next();
      if(L.contains(s)){b=false; System.out.println("No"); break;}
      else if(last.charAt(last.length()-1)!=s.charAt(0)){b=false; System.out.println("No"); break;}
      else{L.add(s);}
    }
    
    if(b){System.out.println("Yes");}
  }
}