import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int D = sc.nextInt();
		int T = sc.nextInt();
      System.out.println(s);
      System.out.println(D);
      System.out.println(T);
      
		
      if(D>s*T){
        System.out.println("Yes");
      } else{
        System.out.println("No");
	}
    }
}