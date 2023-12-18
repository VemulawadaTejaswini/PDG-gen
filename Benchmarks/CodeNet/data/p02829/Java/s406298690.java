import java.util.*;

public class Main {

    public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

              int a,b,sum;

              a = sc.nextInt();
              b = sc.nextInt();

             sum = 0;

             if((a == 1 || a == 2) && (b == 1 || b == 2)) {
                               sum  = 3;
                             System.out.println(sum);
                      }  else if ((a == 1 || a == 3) &&( b == 1 || b == 3)) {
                              sum  = 2;
                                  System.out.println(sum);
                    } else {
                              sum  = 1;
                               System.out.println(sum);
                   } 

            
}

}