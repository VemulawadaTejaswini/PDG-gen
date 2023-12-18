import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	for(int a = -120 ; a < 120 ; a++){
      for(int b = -120 ; b < 120 ; b++){
        if(gojyou(a) - gojyou(b) == X){
          System.out.println(a + " " + b);
          return;
        }
      }
    }
	}
  static long gojyou(int a){
  return a * a * a * a * a;
} 
} 