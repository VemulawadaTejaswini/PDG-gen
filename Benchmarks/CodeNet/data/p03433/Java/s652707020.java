import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int p = n%500;
      if(a >= p) System.out.println("Yes");
      else System.out.println("No");
      sc.close();
    }
}