import java.util.*;

public class A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int result = t / a;
        result = result * b;

        System.out.println(result);
	}
}
