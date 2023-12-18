import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    Map<Integer, Integer> z = new HashMap<>();
    int i = 1;
    int tmp = s;
    
    while(true) {
      z.put(i, tmp);
      if(tmp%2 == 0) {
        tmp = tmp/2;
      } else {
        tmp = 3*tmp+1;;
      }
      
      if(z.containsValue(tmp)) {
        System.out.println(i+1);
        break;
      }
      i++;
    }
  }
}
//need to work on more about HashMap 