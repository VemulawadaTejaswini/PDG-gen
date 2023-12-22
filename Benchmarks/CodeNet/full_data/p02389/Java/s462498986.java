import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
          int num1 = scan.nextInt();
          int num2 = scan.nextInt();
   int s=num1*num2;
   int l=(num1+num2)*2;
   System.out.print(s);
   System.out.print(" ");
System.out.println(l);
          scan.close();

}
}

