import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		if((b-a)==x){
			System.out.println("safe");
		}else if((b-a)<x){
			System.out.println("dangerous");
		}else if((b-a)>x){
			System.out.println("delicious");
		}
		sc.close();
	}
}
			