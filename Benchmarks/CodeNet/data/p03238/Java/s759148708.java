
package study_java2;
import java.util.Scanner;
public class TestZ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        float N = sc.nextInt();
        float A = sc.nextInt();
        float B = sc.nextInt();

        String ans1 = "Hello World";        
        float ans2 = (float)A+B;
        
           if(N > 2) {
               System.out.println(ans1);
           } else if(N == 2){
               System.out.println(ans2);
           } else {
               System.out.println( );
         }
        
        }
    }
 
