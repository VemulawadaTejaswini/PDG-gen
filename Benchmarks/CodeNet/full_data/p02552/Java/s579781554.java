import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 1)
			System.out.println("0");
		else
			System.out.println("1");
		sc.close();
	}
}
