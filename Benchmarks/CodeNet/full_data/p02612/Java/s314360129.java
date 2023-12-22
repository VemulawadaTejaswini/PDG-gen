import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>1000) {
			n=n-1000;
		}
		
		System.out.println(1000-n);

	}

}
