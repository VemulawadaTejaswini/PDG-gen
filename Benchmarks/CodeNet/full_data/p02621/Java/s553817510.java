import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		int sum = a + kaijou2(a) + kaijou3(a);
      	System.out.println(sum);
    }
  
  	public static int kaijou2 (int a) {
      	return a*a;
    }
  
  	public static int kaijou3 (int a) {
      	return a*a*a;
    }
}