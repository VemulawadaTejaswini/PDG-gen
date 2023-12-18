import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		//int b=scan.nextInt();
		//int c=scan.nextInt();
		boolean bool=false;
		String ans="";
if(a.equals("A")) {
			ans="T";
		}
if(a.equals("C")) {
	ans="G";
}
if(a.equals("T")) {
	ans="A";
}
if(a.equals("G")) {
	ans="C";
}
		
		System.out.println(ans);
	}
	}
