import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		String d[]=S.split("");
		String a="No";
		if(d[2].equals(d[3])){
			if(d[4].equals(d[5])){
				a="Yes";
			}
		}
		System.out.println(a);
	}

}