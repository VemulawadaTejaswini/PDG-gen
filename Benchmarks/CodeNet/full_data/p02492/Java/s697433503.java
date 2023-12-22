import java.util.Scanner;



public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(1){

      int a = sc.nextInt();
      char op = sc.nextchar();

      int b = sc.nextInt();

      if(op=='+'){
         int answer = a+b;
         System.out.println(answer);
      }else if(op=='-'){
         int answer = a-b;
         System.out.println(answer);
      }else if(op=='/'){
         int answer = a/b;
         System.out.println(answer);
      }else if(op=='*'){
         int answer = a*b;
         System.out.println(answer);
      }else{
        break;
      }

    } 

  }

}