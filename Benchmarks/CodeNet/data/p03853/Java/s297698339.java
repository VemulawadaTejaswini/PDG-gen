import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt();
		for(int i=0;i<h;i++) {
			String a=sc.next();
			System.out.println(a+"\n"+a);
		}
	}
}