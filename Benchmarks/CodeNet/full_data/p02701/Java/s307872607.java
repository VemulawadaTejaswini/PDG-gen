import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    ArrayList<String> b = new ArrayList<String>();
    for (int i=0;i<a;i++){
      String t = scan.next();
      if (b.contains(t) == false){
        b.add(t);
      }
    }
    System.out.println(b.size());
  }
}
