import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long m = scan.nextLong();
    long limit = (long) m/n;
    long max = 0;
    for (int i=1;i<=limit;i++){
      if (m%i == 0){
        max = i;
      }
    }
    System.out.println(max);

  }

}
