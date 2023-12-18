import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a=s.nextInt();
      	 int b=s.nextInt();
      int min=Integer.min(n*a,b);
      System.out.println(min);
    }
}