import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	long a = s.nextLong();
      	long b= s.nextLong();
      	long mul = a*b;
      	if(a%b == 0)
          System.out.println(mul/2);
      	else
          System.out.println(mul/2+1);
    }
}