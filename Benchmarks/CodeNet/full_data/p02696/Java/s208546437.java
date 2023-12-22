import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long A = sc.nextLong();
      long B = sc.nextLong();
      long N = sc.nextLong();
      long max = 0l;
      for(long i = 0; i <=N; i++){
        long floor1 = (A * i) / B;
        long floor2 = (i / B) * A;
        long floord = floor1 -floor2;
        if(max < floord) max = floord;
      }
      System.out.println(max);
    } 
}