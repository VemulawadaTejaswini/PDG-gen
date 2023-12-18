import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = (int) n/2;
      int y = k*2;
      if(y == n) System.out.println(n);
      else System.out.println(n*2);
    }
}