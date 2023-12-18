import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int ac = 0;
    int wa = 0;
    boolean[] end = new boolean[n+2];
    for(int i = 0;i<m;i++){
      int p = sc.nextInt();
      String s = sc.next();
      if(end[p]){
        continue;
      }else if(s.equals("AC")){
        end[p] = true;
        ac++;
      }else{
        wa++;
      }
    }
    System.out.println(ac);
    System.out.println(wa);
  }
}
