import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int H=sc.nextInt();
    int A=sc.nextInt();
    
    System.out.print((H+A-1)/A);
  }
}