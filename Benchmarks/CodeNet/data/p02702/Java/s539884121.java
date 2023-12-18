import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String str = sc.next();
          int count = 0;
          long num2 = 0;
          for(int i = 0; i <= str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++) {
              num2 = Integer.parseInt(str.substring(i, j));
          if( num2 % 2019 == 0){
            count++;
          }
        }
      }
      System.out.println(count);
          }
        }