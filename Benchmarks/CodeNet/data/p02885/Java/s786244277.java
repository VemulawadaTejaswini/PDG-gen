import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
      	int s = a-2*b;
      
      if (s <= 0) {
        System.out.println(0);
      } else {
		System.out.println(s);
      }
	}
}