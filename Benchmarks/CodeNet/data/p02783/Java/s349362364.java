import java.util.*;
public class C {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int sum = a%b==0?a/b:a/b+1;
		System.out.println(sum);
	}
}
