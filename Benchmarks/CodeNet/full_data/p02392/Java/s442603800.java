import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int c = x.nextInt();
		if(a < b && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}