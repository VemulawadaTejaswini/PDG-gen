import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      long A=sc.nextLong();
      double B=sc.nextDouble();
      long b=(long)(B*100);
      long x=A*b;
      long y=x%(100);
      long a=(long)(x-y)/100;
      System.out.println(a);
	}
}