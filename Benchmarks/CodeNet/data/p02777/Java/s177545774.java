import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next(),t=sc.next();
    int a=sc.nextInt(),b=sc.nextInt();
    String u=sc.next();
    if(u.equals(s)){
      a=a-1;
    }else if(u.equals(t)){
      b=b-1;
    }else{}
    System.out.println(a+" " + b);
  }
}
