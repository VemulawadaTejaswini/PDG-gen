import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gyo = sc.nextInt();
		int retu = sc.nextInt(); //1個目読み込み
		while (gyo != 0 && retu != 0){
			for(int i=0;i<gyo;i++){ //行作成
				for(int k=0;k<retu;k++){ //列作成
					System.out.print("#");
				}
			System.out.print("\n");
			}
			gyo = sc.nextInt();
			retu = sc.nextInt();
		}
	}
}
