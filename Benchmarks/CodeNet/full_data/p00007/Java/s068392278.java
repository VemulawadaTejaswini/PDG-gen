import java.util.Scanner;

//Debt Hell
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = 100000;
		while(n--!=0)a*=1.05;
		int p = (int)a;
		int r = p%10000;
		p-=r;
		if(r>=5000)p+=10000;
		System.out.println(p);
	}
}