import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c=0;
		if(a==1 && b==2)c=3;
		if(a==1 && b==3)c=2;
		if(a==3 && b==2)c=1;
		System.out.println(c);
	}

}