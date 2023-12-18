import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String n = scan.next();
    String d = scan.next();
    int N = Integer.parseInt(n);
    int D = Integer.parseInt(d);
    
    int count = 0;
    int save = 1;
    for (int i=1; i<N; i++) {
      
      if (i-D >= 0 && i+D < N) {
         count++;
      }
    }
    
    System.out.println(count++);


    }
}