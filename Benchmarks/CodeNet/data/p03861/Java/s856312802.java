import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    int x = sc.nextInt();
    int count = 0;

    for(long i = a; i < (b + 1); i++){
      if(i % x == 0){
        count+=1;
      }
    }
  System.out.println(count);
  }
}
