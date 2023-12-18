import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    Set<String> set = new HashSet<String>();
    int n = s.nextInt();
    for(int i = 0; i < n; i++){
      set.add(s.nextLine().toLowerCase());
    }
    System.out.println(set.size());
  }
}