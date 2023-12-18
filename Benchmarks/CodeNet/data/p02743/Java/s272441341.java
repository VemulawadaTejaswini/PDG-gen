import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
      int d = c - a - b ;
      if(d>0&&d*d-4*a*b>0){System.out.println("Yes");}
    else{System.out.println("No");}
  }
}
