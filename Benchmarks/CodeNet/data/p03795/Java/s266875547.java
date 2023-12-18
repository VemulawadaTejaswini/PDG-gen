import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),x,y;
    x=n*800;
    y=200*(n/15);
    
    System.out.println(x-y);
  }
}
