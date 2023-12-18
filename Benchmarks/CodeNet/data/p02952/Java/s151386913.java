import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a=t.nextInt(), cont = 0;
		for(int i=1;i<=a;i++) {
			if(i<=9 && i>=1 || i>=100 && i<1000 || i>=10000 && i<100000 || i>= 1000000 && i<=10000000) {
			cont += 1;
			}
		}
		
		System.out.println(cont);
	}
	}
