
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		char abcd[] = sc.next().toCharArray();
		int a = abcd[0] - '0';
		int b = abcd[1] - '0';
		int c = abcd[2] - '0';
		int d = abcd[3] - '0';
		if     (a+b+c+d==7)System.out.printf("%d+%d+%d+%d=7\n", a,b,c,d);
		else if(a+b+c-d==7)System.out.printf("%d+%d+%d-%d=7\n", a,b,c,d);
		else if(a+b-c+d==7)System.out.printf("%d+%d-%d+%d=7\n", a,b,c,d);
		else if(a+b-c-d==7)System.out.printf("%d+%d-%d-%d=7\n", a,b,c,d);
		else if(a-b+c+d==7)System.out.printf("%d-%d+%d+%d=7\n", a,b,c,d);
		else if(a-b+c-d==7)System.out.printf("%d-%d+%d-%d=7\n", a,b,c,d);
		else if(a-b-c+d==7)System.out.printf("%d-%d-%d+%d=7\n", a,b,c,d);
		else if(a-b-c-d==7)System.out.printf("%d-%d-%d-%d=7\n", a,b,c,d);
		sc.close();
	}

}
