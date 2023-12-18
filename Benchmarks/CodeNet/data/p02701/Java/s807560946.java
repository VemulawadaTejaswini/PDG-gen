import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<String> st = new HashSet<>();
    int n = sc.nextInt();
    for(int i =0 ; i<n; i++){
      String keihin = sc.next();
      st.add(keihin);
    }
    System.out.println(st.size());
  }
}