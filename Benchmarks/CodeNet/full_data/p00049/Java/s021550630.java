import java.util.Scanner;
public class Main{
	private static Scanner sc=new Scanner(System.in);
	public static void  main(String[]agrs){
		int a = 0 , b  = 0, o = 0, ab = 0;
		while(sc.hasNext()){
			String temp = sc.nextLine();
			String[] str = temp.split(",");
			String bl = str[1];
			if(bl.equals("A")) a++;
			else if(bl.equals("B")) b++;
			else if(bl.equals("AB")) ab++;
			else if(bl.equals("O")) o++;
			System.out.println(a + "\n" + b + "\n" + ab + "\n" + o);
		}
	}
}