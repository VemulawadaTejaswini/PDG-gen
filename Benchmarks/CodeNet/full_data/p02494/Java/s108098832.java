import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 0 && w == 0) break;
			for(int n = 0;n < h;n++){
				for(int m = 0;m < w;m++){
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
		}
	}
}