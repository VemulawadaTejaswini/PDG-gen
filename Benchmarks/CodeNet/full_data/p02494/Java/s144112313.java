import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}

}