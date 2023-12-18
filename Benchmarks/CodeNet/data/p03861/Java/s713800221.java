import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		long a,b,x;
		int count=0;
		Scanner sc = new Scanner(System.in);

		a = sc.nextLong();
		b = sc.nextLong();
		x = sc.nextLong();

		for(long i=a; i<=b; i++){
			if(i%x == 0) count++;
		}

		System.out.println(count);
	}
}

