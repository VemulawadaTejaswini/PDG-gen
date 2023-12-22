import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
              	int c = sc.nextInt();
              float x = a/c;
              if( x > b){
            System.out.println("No");
        }else{
            System.out.println("Yes");
          }
            }
        }
    }
}