import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N = sc.nextInt();
      long ans = 1;
      long max = new Double(Math.pow(10,18)).longValue();
      for(int i = 0 ; i < N; i++) ans *= sc.nextLong();
      Long ansL = Long.valueOf(ans);
      if(ansL.compareTo(max) == 1 || ansL.compareTo(0l) == -1){
        System.out.println("-1");
      } else {
        System.out.println(ans);
      }
    } 
}