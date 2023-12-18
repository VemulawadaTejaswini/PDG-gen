import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b<a-w)System.out.println(a-b-w);
		if(b>a+w)System.out.println(b-a-w);
		else System.out.println(0);
	}
}