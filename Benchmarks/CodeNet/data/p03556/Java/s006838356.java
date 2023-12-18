import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
    int d=(int)Math.floor(Math.pow(n,0.5));
    System.out.print((int)Math.pow(d,2));
  }
}
