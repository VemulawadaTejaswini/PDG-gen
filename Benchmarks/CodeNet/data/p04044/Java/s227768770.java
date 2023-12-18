import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    List<String> list = new ArrayList<String>();
    for(int i = 0; i<n; i++){
      list.add(sc.next());
    }
    
    Collections.sort(list);
    for(int i=0; i<list.size(); i++){
      System.out.print(list.get(i));
    }
    }
}