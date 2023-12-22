import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=3; i<=n; i++){
			if(i%3==0 || i%10==3){
				System.out.print(" " + i);
			}
		}
	}
}