import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int A = sc.nextInt();//高HP
      int B = sc.nextInt();//高攻撃力
      int C = sc.nextInt();//青HP
      int D = sc.nextInt();//青攻撃力
      
      if((C-B)>(A-D)){
       System.out.print("No");
      }
      else{
       System.out.print("Yes");
      }
    }
}