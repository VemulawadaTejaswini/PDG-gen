import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
    for(int i = 0; i < n; i++){
      String check = sc.next();
      if(!hashmap.containsKey(check)){
        hashmap.put(check, 0);
      }
    }
    System.out.println(hashmap.size());
    sc.close();
  }
}