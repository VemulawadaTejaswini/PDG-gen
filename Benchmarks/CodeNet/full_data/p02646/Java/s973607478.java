import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a  =sc.nextLong() +1000000000L;
    long v = sc.nextLong();
    long b = sc.nextLong() +1000000000L;
    long w = sc.nextLong();
    long t = sc.nextLong();
    String ans = "YES";
    if(v <= w) ans = "NO";
    else if(a < b){
      if(t*w + b > 10000000000L) {
        if((1000000000L - a - t*w)/(v-w) > t) {
        	ans = "NO";
        }
      }
      else {
      	if((b-a)/(v-w) > t ) ans = "NO";
      }
    }
    else{
    	if(b - t*w < 0) {
            if((a - t*w)/(v-w) > t) {
            	ans = "NO";
            }
          }
        else {
          if((a-b)/(v-w) > t ) ans = "NO";
        }
    }
    System.out.println(ans);
    sc.close();
  }
}