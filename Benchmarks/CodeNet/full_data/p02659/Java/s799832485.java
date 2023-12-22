import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
    int b = (sc.nextDouble() * 100); 
  	long c = (long)(a * b / 100);
    System.out.println(c);
  }
}