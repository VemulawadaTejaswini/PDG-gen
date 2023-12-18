import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
      int b = scan.nextInt();
      int result = a+b>a*b?a+b:a*b;
      result = result>a-b?result:a-b;
      System.out.println(result);
	}
}
