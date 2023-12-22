import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      int count = 0;
      for(int i=0;i<=S.length()-4;i++){
          for(int j=i+4;j<=S.length();j++){
              long wareruka = Long.parseLong(S.substring(i,j));
            
              if(wareruka % 2019 == 0){
                  count++;
              }
          }
      }
 
      System.out.println(count);
    }
}