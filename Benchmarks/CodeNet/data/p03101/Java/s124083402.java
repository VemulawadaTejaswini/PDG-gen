import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int h=scan.nextInt();
    int w=scan.nextInt();
    h=h-scan.nextInt();
    w=w-scan.nextInt();
    System.out.println(h*w);
  }
}