import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1,num2;
    num1=sc.nextInt();
    num2=sc.nextInt();
    while (num1 != 0 && num2 != 0){
      num1=sc.nextInt();
      num2=sc.nextInt();
      System.out.println(num1+" "+num2);
    }
  }
}

