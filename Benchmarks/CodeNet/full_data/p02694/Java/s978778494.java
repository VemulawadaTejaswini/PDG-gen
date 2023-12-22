import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long a = 100;
    long b = 1;
    long max = (int)Math.pow(10,18);
    long cnt = 0;

    for(int i=0; i<max; i++) {
      a+=b;
      cnt++;
      if(a>=X){
        break;
      }
      if(X<100){
        continue;
      }
    }
    System.out.println(cnt);
  }
}