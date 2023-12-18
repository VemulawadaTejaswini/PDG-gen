import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 		// 整数の入力
    String b = sc.next();
    if(b.length() < 11){
    int a = Integer.parseInt(b);
    int x, y;
    int min = -1;
      for(int i = 1; i < a; i++){
        if(a % i == 0){
          int x1 = i, y1 = a / i;
		  if(x1 + y1 -2 < min || min == -1){     
            x = x1;
           	y = y1;
          	min = x1 + y1 - 2;
          }
        }
      }
      System.out.println(min);
    }else{
    long a = Long.parseLong(b);
    long x, y;
    long min = -1;
      for(int i = 1; i < a; i++){
        if(a % i == 0){
          long x1 = i, y1 = a / i;
		  if(x1 + y1 -2 < min || min == -1){     
            x = x1;
           	y = y1;
          	min = x1 + y1 - 2;
          }
        }
      }
      System.out.println(min);
    }
      }
  }
