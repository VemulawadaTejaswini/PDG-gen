import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String,Integer> blue = new HashMap<String,Integer>();
    for(int i = 0; i < n; i++){
      String str = sc.next();
      if(blue.contains(str)){
        int count = blue.get(str)+1;
        blue.put(str,count);
      }
      else{
        blue.put(str,0);
      }
    }
    int m = sc.nextInt();
    Map<Strng,Integer> red = new HashMap<String,Integer>();
    for(int i = 0; i < m; i++){
      String str = sc.next();
      if(red.contains(str)){
        int count = red.ger(str) + 1;
        red.put(str,count);
      }
      else{
        red.put(str,0);
      }
    }
    int ans = 0;
    for(String i:blue.keySet()){
      int temp;
      if(red.countains(i)){
        temp = blue - red;
      }
      else{
        temp = blue;
      }
      if(ans < temp){
        ans = temp;
      }
    }
    if(ans <= 0){
      System.out.println(0);
    }
    else{
      System.out.println(ans);
    }
  }
}