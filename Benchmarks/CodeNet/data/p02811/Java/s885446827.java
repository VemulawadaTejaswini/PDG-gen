import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    if(a*500>=b){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}