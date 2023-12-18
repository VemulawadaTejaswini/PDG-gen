import java.util.Scanner;

public class Main{
public static void main(String[] args){
  System.out.println("input a");
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  if(a <1 || 1000<a ){
    System.out.println("0<=a=<0,input a again");
    a = s.nextInt();
  }
  System.out.println("input b");
  int b = s.nextInt();
  if(b <1 || 1000<b ){
    System.out.println("0<=b=<0,input b again");
    b = s.nextInt();
  }

  int sum = a * b;
  if(sum%2==0){
    System.out.println("Even");
  }else if(sum%2 == 1){
    System.out.println("Odd");
  }


}


}
