import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int i,t;
		t = 0;
		for(i = a; i <= b; ++i){
			if(c % i == 0)
				++t;
		}
		System.out.print(t);
	}

}