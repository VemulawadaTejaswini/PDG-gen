import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		int i=0;
		int j = 0;
		String[][] s = new String[H][W];
		for (i=0;i<H;i++){
			for (j=0;j<W;j++){
				s[i][j] = sc.next();
			}
			sc.nextLine();
		}
		for (i=0;i<H;i++){
			for (j=0;j<W;j++){
				if (s[i][j]=="snuke"){
					break;
				}
			}
		}
		System.out.println((char)(j+1+64)+(i+1));
	}

}
