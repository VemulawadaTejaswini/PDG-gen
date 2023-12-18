import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(((x>=1)&&(x<=81))&&(x%10)!=0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}