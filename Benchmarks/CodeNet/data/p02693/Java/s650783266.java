import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      int num1 = l.nextInt();
      Scanner m = new Scanner(System.in);
      int num2 = m.nextInt();
      Scanner x = new Scanner(System.in);
      int num3 = x.nextInt();
      
      for(int i=num2; i<=num3; i++){
          int div = num2;
          int and = div/num1;
          if(div%2==0){
              System.out.println("OK");
            }
            div++;
        }
        System.out.println("NG");
           
          
}
}
