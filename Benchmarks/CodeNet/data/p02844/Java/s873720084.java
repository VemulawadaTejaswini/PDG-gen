import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int cnt = 0;
      for(int i=0;i<=9;i++){
        String I = String.valueOf(i);
        if(!s.matches("[0-9]*"+I+"[0-9]*"))continue;
        for(int j=0;j<=9;j++){
          String J = String.valueOf(j);
          if(!s.matches("[0-9]*"+I+"[0-9]*"+J+"[0-9]*"))continue;
          for(int k=0;k<=9;k++){
            String K = String.valueOf(k);
            if(s.matches("[0-9]*"+I+"[0-9]*"+J+"[0-9]*"+K+"[0-9]*"))cnt++;
          }
        }
      }
      System.out.println(cnt);
    }
}