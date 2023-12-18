import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int qNum = sc.nextInt();
    int sTime = sc.nextInt();
    boolean[] ac = new boolean[qNum];
    int acCount = 0;
    int waCount = 0;
    
    for (int i = 0; i < sTime; i++){
      int q = sc.nextInt();
      String res = sc.next();
      if (!ac[q-1]){
        if (res.equals("AC")){
          ac[q-1] = true;
          acCount++;
        } else{
          waCount++;
        }
      }
    }
    
    System.out.println(acCount + " " + waCount);
    
  }
}