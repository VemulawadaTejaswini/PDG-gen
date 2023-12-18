import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int X=sc.nextInt();
    int A=sc.nextInt();
    System.out.println(Math.min(1,X/A)*10);
  }
}