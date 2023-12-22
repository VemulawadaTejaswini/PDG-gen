import java.util.Scanner;
	public class Main{
		public static void main(String[]args){
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			int i,j;
			for(i=0;i<y;i++){
				for(j=0;j<x;j++){
					System.out.printf("#");
				}
				System.out.println("");
			}
		}
	}