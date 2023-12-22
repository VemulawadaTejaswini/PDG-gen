import java.util.Scanner;
public class Main {
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     for(int i=1;i>0; i++){
          String c0 ="?";
          String c1 ="+";
          String c2 ="-";
          String c3 ="*";
          String c4 ="/";
          int a = scanner.nextInt();
          String op = scanner.next();
          int b = scanner.nextInt();
          if(op.equals(c0))break;
          if(op.equals(c1)){
              int e1=a+b;
              System.out.println(e1);
          }
          else if(op.equals(c2)){
              int e2=a-b;
              System.out.println(e2);
          }
          else if(op.equals(c3)){
              int e3=a*b;
              System.out.println(e3);
          }
          else if(op.equals(c4)){
              int e4=a/b;
              System.out.println(e4);
          }
     }     
}
}