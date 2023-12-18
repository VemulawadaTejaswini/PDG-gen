import ava.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int a,b,c,d;
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    d=scan.nextInt();
    int tmp=Math.min(a,b)+Math.min(c,d);
    System.out.println(tmp);
  }
}

    