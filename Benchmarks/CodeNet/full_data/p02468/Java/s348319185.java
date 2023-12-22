import java.util.Scanner;

public class Main{
public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		long work = a;
		for(int i = 1; i < b; i++){
			work = work * a;
		}
		System.out.println(work);
	}
}