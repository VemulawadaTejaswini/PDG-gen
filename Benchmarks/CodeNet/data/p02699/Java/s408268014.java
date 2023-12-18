import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Set <String> set = new HashSet<>();
    int n = scan.nextInt();
    String[] s = new String();
    for(int i = 0; i < n; i++){
      s[i] = scan.nextLine();
      set.add(s[i]);
    }
    System.out.println(set.size());
  }
}