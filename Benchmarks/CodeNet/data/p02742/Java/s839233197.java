import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		long h=scan.nextInt();
		long w=scan.nextInt();
		long c1 = w/2;
		if(w%2==1)c1++;
		long c2 = w/2;
		long r = h/2;
		long sum = (c1+c2)*r;
		if(h%2==1)sum+=c1;
		System.out.println(sum);

 	}

}