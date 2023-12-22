import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int a,b,c,s=0;
	Scanner scan = new Scanner(System.in);
	
	a= Integer.parseInt(scan.next());
	b= Integer.parseInt(scan.next());
	c= Integer.parseInt(scan.next());

	for(;a<=b;a++) {
		if(c%a==0)
			s++;
	}
	System.out.println(s);
	}
	
}