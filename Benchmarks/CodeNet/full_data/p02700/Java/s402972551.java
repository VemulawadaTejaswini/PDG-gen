import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int A = sc.nextInt();//高HP
      int B = sc.nextInt();//高攻撃力
      int C = sc.nextInt();//青HP
      int D = sc.nextInt();//青攻撃力
      
      //どちらかが先にHP０になるまで
      while(true){
       C = C-B;
       A = A-D;
      
      if(C<=0){
          System.out.print("Yes"); 
        break;
      }
        else if(A<=0){
          System.out.print("No");
         break;
        }
      }
    }
}