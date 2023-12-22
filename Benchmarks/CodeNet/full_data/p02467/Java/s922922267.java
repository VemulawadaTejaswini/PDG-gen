import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 2;
         System.out.print(t+":");
          
    while (t % 2 == 0) {
      System.out.print(" "+ k);
      t /= 2;
    }
    for (int i = 3; i * i <= t; i += 2) {
      while (t % i == 0) {
        System.out.print(" " + i);
        t /= i;
      }
    }
    if (t > 1) System.out.println(" "+t);
    }
}