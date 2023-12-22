import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
          
        int c = scan.nextInt();
      	int d = scan.nextInt();
      
      	if ( (c/b) == (a/d)) {
              if ( (a%d == 0) && !(c%b == 0)) {
                System.out.println("No");
              } else {
                System.out.println("Yes");
              }
        } else if ( (c/b) <= (a/d) ){
          System.out.println("Yes");
        } else {
            System.out.println("No");
        }
 
        scan.close();
    }
}
