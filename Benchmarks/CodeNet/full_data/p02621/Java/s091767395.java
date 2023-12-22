import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	System.out.println(n + (int)Math.pow(n,2) + (int)Math.pow(n,3));
	}
}