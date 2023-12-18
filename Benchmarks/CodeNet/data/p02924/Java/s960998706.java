import java.util.Scanner;

public class Main {
		
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
			long a=(n-1)*n;
			a=a/2;
			System.out.println(a);
		}

	}
