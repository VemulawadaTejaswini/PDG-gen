import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gyo = sc.nextInt();
		int retu = sc.nextInt();
		while (gyo != 0 && retu != 0){
			for(int i=0;i<gyo;i++){
				for(int k=0;k<retu;k++){
					System.out.print("#");
				}
			}
			int gyo = sc.nextInt();
			int retu = sc.nextInt();
		}
	}
}
