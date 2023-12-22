import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  int n = sc.nextInt();
  
  boolean[] ok = new boolean[201];
  for(int i =0;i<n;i++){
      int c = sc.nextInt();
      ok[c] =true;
  }
  int result = 500;
  int diff = 500;
  for(int i =0;i<=200;i++){
      if(!ok[i]){
          int abs = Math.abs(x-i);
          if(abs<diff){
              result =i;
              diff = abs;
          }else if(abs == diff){
                result = Math.min(result, i);
          }
      }
  }
  System.out.println(result);
    }
}