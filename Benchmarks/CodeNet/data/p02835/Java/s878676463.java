import java.util.Scanner;
public class solution {
  public static void main(String[]args){
  Scanner robo=new Scanner(System.in);
    int sum=0;
    int num=robo.nextInt();
    int num1=robo.nextInt();
    int num2=robo.nextInt();
    sum=num+num1+num2;
    if(sum>=23)
    {
      System.out.println("bust");
    }
    else{
    System.out.println("win");
    }
  }
}