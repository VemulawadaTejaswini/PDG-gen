import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       for(;;) {
          int s=sc.nextInt();
          if(s==-1)break;
          System.out.println( Integer.toString(s, 4));
       }
    }
}
