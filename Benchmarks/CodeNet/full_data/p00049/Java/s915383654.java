import java.util.Scanner;
public class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;
		while(sc.hasNext()){
			String bl = sc.next().split(",")[1];
			if(bl.equals("A")) a++;
			if(bl.equals("B")) b++;
			if(bl.equals("AB")) ab++;
			if(bl.equals("O")) o++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(ab);
			System.out.println(o);
		}
	}
}