import java.util.Scanner;
import java.io.*;

class Main{
  public static void main(String[] args){
    do{
      Scanner obj = new Scanner(System.in);
      int a = obj.nextInt();
      char op = obj.next().charAt(0);
      int b = obj.nextInt();
    
      if(op == '+'){
        System.out.println(a+b);}
      else if(op == '-'){
        System.out.println(a - b);}
      else if(op == '*'){
        System.out.println(a * b);}
      else if(op == '/'){
        System.out.println(a / b);}
      else if(op == '?'){
        break;}
    } while(true);
  }
}