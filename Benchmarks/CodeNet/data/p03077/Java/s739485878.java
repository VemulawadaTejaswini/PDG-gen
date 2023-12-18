import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long[] input = new long[5];
    long min = 1000000000000000L;
    for (int i = 0; i < 5; i++){
        long next = sc.nextLong();
        if (min > next){
            min = next;
        }
    }
    long minTimes = (N / min + 1) + 4;
    System.out.println(minTimes);

  }
  
}
