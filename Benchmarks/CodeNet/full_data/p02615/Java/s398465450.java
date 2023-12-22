import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long min = 1000000000;
    long sum = 0;
    for(int i = 0;i<N;i++){
      long tmp = sc.nextLong();
      sum += tmp;
      if(min>tmp){
        min = tmp;
      }
    }
    System.out.println(sum-min);
  }
}