import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int N =sc.nextInt();
		int z=0;
		for(int i =0;i<=N;i++){
			z=z+i;
		}
		System.out.println(z);
	}

}
