import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		if(a>=3 && b>=3) {
			System.out.println((a-2)*(b-2));
		}
		else if(a==2 || b==2) {
			System.out.println("0");
		}
		else if(a==1 || b==1) {
			System.out.println(Math.max(Math.max(a-2, b-2),0));
		}
		int[][] box=new int[a+2][b+2];
		for(int i=0; i<=a+1; i++) {
			for(int j=0; j<=b+1; j++) {
				box[i][j]=0;
			}
		}
	}
}