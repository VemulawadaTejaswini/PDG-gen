import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		
		int h=S/3600;
		int m=(S-3600*h)/60;
		int s=S-3600*h-60*m;
		
		System.out.println(h+":"+m+":"+s);
		

	}
}
