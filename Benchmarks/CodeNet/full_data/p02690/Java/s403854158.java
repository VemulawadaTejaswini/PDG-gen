import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long X = sc.nextLong();
	for(long a = -200 ; a < 200 ; a++){
      for(long b = -200 ; b < 200 ; b++){
        if(gojyou(a) - gojyou(b) == X){
          System.out.println(a + " " + b);
          return;
        }
      }
    }
	}
  static long gojyou(long a){
  return a * a * a * a * a;
} 
} 