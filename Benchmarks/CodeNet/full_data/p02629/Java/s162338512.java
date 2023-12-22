import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp = 1;
    int p = 0;
    while(true){
      p += (int)Math.pow( 26 , tmp );
      if( n <= p ){
        break;
      }
      tmp++;
    }
    int [] a = new int [tmp];
    for(int i=a.length;i>0;i--){
      a[a.length-i] = n / (int)Math.pow(26,i-1);
      n = n % (int)Math.pow(26,i-1);
    }
    for(int i=0;i<a.length;i++){
      System.out.print((char)((int)'a'+a[i]-1));
    }
  }
}