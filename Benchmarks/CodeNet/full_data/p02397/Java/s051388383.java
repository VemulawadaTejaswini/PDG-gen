import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1,num2 = 1;
    while ((num1=sc.nextInt()) != 0 && (num2=sc.nextInt()) != 0){
      System.out.println(num1+" "+num2);
    }
  }
}

