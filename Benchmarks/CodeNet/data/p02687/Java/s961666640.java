import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String[] c = new String[] {"ABC", "ARC"};
    List<String> list = new ArrayList<String>(Arrays.asList(c));
    list.remove(S);
    System.out.println(c[0]);
  }
}
