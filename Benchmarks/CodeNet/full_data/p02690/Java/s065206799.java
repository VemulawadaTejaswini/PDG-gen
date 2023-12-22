import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long X = sc.nextLong();
	for(int a = -120 ; a < 120 ; a++){
      for(int b = -120 ; b < 120 ; b++){
        if(gojyou(a) - gojyou(b) == X){
          System.out.println(a + " " + b);
          return;
        }
      }
    }
	System.out.println(fa + " " + fb);
	}
  static long gojyou(int a){
    long a2 = (long)a;
  return Math.pow(a2 , 5l);
} 
} 