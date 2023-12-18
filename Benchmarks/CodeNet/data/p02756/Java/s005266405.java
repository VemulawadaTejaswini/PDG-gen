import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int q = sc.nextInt();
    int t = 0;
    int zenngo = 0;
    for(int i = 0;i< q;i++){
      t = sc.nextInt();
      if(t == 1){
        zenngo++;
      }else{
        t = sc.nextInt();
        String ss = sc.next();
        if(t == 1){
          if(zenngo % 2 == 0){
            s = ss + s;
          }else{
            s = s + ss;
          }
        }else{
          if(zenngo % 2 == 0){
            s = s + ss;
          }else{
            s = ss + s;
          }

        }
      }
    }
    if(zenngo % 2 == 1){
      StringBuffer sb = new StringBuffer(s);
      s = sb.reverse().toString();
    }
    System.out.println(s);
  }
}
