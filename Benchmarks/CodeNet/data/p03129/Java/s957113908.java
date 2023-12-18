import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      if(2*k-1<=n)System.out.println("YES");
      else System.out.println("NO");
    }
}