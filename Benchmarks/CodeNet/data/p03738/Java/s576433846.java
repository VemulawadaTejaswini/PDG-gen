import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long a=sc.nextLong(),b=sc.nextLong();
    if(a>b){
      System.out.println("GREATER");
    }else if(a==b){
      System.out.println("EQUAL");
    }else{
      System.out.println("LESS");
    }
  }
}
