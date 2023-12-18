import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str=s.next();
		s.close();
		String[] ss=str.split("/");
		int year=Integer.parseInt(ss[0]);
		if(ss[1].startsWith("0"))ss[1]=ss[1].substring(1, 2);
		int month=Integer.parseInt(ss[1]);
		if(ss[2].startsWith("0"))ss[1]=ss[2].substring(1, 2);
		int date=Integer.parseInt(ss[2]);
		if(year<=2019&&month<=4&&date<=30){
			System.out.println("Heisei");
		}else{
			System.out.println("TBD");
		}
	}
}