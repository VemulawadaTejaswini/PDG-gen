import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a;
    int b;
    int count;
    int button;
    while(true) {
    	a = sn.nextInt();
      	if (a > 3) {
          return
        }
    }
    while(true) {
    	b = sn.nextInt();
      	if (b < 20) {
          return
        }
    }
    do {
      	System.out.println("どのボタン? (0)A  (1)B");
   		 button = sn.nextInt();
   		 if(button == 0) {
           count += a--;
         }
   		 if(button == 0) {
           count += b--;
    }while(a < 0 || b < 0);
  }
}
      
    