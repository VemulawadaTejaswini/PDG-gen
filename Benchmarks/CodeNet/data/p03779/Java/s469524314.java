import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int X=sc.nextInt();


		for(int i=1; i<=10000; i++) {
			if(i*(i+1)/2>=X) {
				System.out.println(i);
				return;
			}
		}
	}
}