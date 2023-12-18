import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
      boolean flag = false;
      int fa = 0;
      int fb = 0;
	for(int a = -130 ; a < 130 ; a++){
      for(int b = -130 ; b < 130 ; b++){
        if(gojyou(a) - gojyou(b) == X){
          flag = true;
          fa = a;
          fb = b;
          break;
        }
      }
      if(flag)
        break;
    }
	System.out.println(fa + " " + fb);
	}
  static long gojyou(int a){
  return a * a * a * a * a;
} 
} 