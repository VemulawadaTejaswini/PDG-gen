import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String sarry[] = new String[n];
    
    for(int i =0; i < n; i++){
      sarry[i] = sc.next();
    }
    int cnt = 0;
    for(int i = 0; i < n-1; i++){      
      for(int j = i+1; j < n; j++){
        if(sarry[i].length() == sarry[j].length()){
          if(sarry[i].equals(sarry[j])){
            cnt++;
          }
        } else {
          String a = "";
          String b = "";
          if(sarry[i].length() < sarry[j].length()){
            a = sarry[i];
            b = sarry[j];
          }	else {
            a = sarry[j];
            b = sarry[i];
          }
          System.out.println(a + "/" + b);
        }
      }
    }
    
  }
}