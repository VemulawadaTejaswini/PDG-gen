import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] code = num.split(" ",0);
      	Integer a = Integer.parseInt(code[0]);
      	Integer b = Integer.parseInt(code[1]);
      	Integer c = lcm(a,b);
      	System.out.println(c);
    }
  
	public static int lcm (int a, int b) {
      int temp;
      long c = a;
      c *= b;
      while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (int)(c/b);
	}
}

