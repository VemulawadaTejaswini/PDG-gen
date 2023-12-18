import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	boolean delta = false;
      
      	if(a == b && b == c) delta = true;
      
      	if(delta) System.out.println("Yes");
      	else System.out.println("No");
	}
}
