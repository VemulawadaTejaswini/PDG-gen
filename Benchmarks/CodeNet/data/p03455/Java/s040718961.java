import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a*b;
    sc.close();

    if(c%2==0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}