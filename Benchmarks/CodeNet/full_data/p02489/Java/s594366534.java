import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1;
		while(a != 0){
			System.out.printf("Case %d: %d",i ,a);
			a = sc.nextInt();
			i++;
		}
		
	}

}