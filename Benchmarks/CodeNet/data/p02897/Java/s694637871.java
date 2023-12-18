import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	double n = sc.nextDouble();
      	if(n%2==0) System.out.println(0.5);
      	else System.out.println((n+1)/2/n);
    }
}