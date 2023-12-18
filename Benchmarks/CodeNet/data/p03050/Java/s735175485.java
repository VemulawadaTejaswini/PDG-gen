import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long sum = N-1;
    for(int i = 1;i < N/2;i++){
      if(N / i == N % i){
        sum+=i;
        //System.out.println(i +":"+N%i);
      }
    }
    System.out.println(sum);
  }
}