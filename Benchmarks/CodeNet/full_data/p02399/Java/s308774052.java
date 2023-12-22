import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int d,r;
       float f,x,y;
       x=a;
       y=b;
       d=a/b;
       f=x/y;
       r=a%b;
       System.out.print(d + " ");
       System.out.print(r + " ");
       System.out.println(f);
	}

}