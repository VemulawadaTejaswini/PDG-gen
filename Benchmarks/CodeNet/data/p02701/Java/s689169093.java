import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    ArrayList<String> b = new ArrayList<String>();
    for (int i=0;i<a;i++){
      String t = scan.next();
      if (check(t,b) == false){
        b.add(t);
      }
    }
    System.out.println(b.size());
  }

  public static boolean check(String a, ArrayList<String> b){
    for (int i=0;i<b.size();i++){
      if (a.equals(b.get(i)) == true){
        return true;
      }
    }
    return false;
  }
}
