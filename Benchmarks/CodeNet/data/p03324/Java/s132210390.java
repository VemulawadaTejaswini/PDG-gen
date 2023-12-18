import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int D = sc.nextInt();
      int N = sc.nextInt();
      int output = (int)Math.pow(100,D);
      myout(output * N);
	}
}
