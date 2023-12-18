import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int members = sc.nextInt();
    int iniP = sc.nextInt();
    int ans = sc.nextInt();
    int[] ansM = new int[ans];
    String[] surv = new String[members];
    
    for (int i = 0; i < ans; i++){
      ansM[i] = sc.nextInt();
    }
    
    for (int i = 0; i < members; i++){
      int p = iniP;
      surv[i] = "Yes";
      for (int j = 0; j < ans; j++){
        if(i+1 != ansM[j]){
          p--;
          if(p <= 0){
            surv[i] = "No";
            break;
          }
        }
      }
    }
    
    for (int i = 0; i < members; i++){
      System.out.println(surv[i]);
    }
  }
}