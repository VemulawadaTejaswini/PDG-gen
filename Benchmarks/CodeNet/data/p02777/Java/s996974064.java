import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String s=scan.next();
    String t=scan.next();
    int a=scan.nextInt();
    int b=scan.nextInt();
    String u=scan.next();
    if(s.equals(u)){
      a--;
    }else if(t.equals(u)){
      b--;
    }
    System.out.println(a+" "+b);
  }
}