import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int i;
      for(i=1;i<=1000;i++){
        if(Math.floor(i*0.08)==A && Math.floor(i*0.1)==B){
          System.out.println(i);
          return;
        }
      }
        System.out.print("-1");
    }
}
