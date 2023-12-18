import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	if(a+b+1>c) {
		System.out.println(b+c);
	}
	else {
		System.out.println(a+b+1+b);
	}
	}
}
