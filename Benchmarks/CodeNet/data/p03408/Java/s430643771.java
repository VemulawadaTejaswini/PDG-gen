import java.util.Scanner;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Map<String,Integer> blue = new HashMap<>();
    Map<String,Integer> red = new HashMap<>();
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    for(int i = 0; i < N; i++) {
      String s = sc.next();
      if(blue.get(s) == null) {  //値が存在しない場合
        blue.put(s, 1);
      }else {                    //値がすでに存在する場合
        blue.put(s, blue.get(s)+1);
      }
    }
    
    for(int i=0;i<M;i++) {
      String s=sc.next();
      if(red.get(s) == null) {
        red.put(s, 1);
      }else {
        red.put(s, red.get(s)+1);
      }
    }
    
    int max = 0;
    for(String key : blue.keySet()) {
      int now;
      if(red.containsKey(key)) {
        now = blue.get(key) - red.get(key);
      }else {
        now = blue.get(key);
      }
      if(max < now) {
        max = now;
      }
    }
    System.out.println(max>0?max:0);
  }
}
    