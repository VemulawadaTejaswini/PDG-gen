import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int H=sc.nextInt(),W=sc.nextInt();
		String[][] a = new String[H][W];
		boolean[] sharpx=new boolean[H];
		boolean[] sharpy=new boolean[W];

		for(int i=0;i<H;i++) {
			a[i]=sc.next().split("");
		}

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(a[i][j].equals("#")) {
					sharpx[i]=true;
					sharpy[j]=true;
				}
			}
		}

		for(int i=0;i<H;i++) {
			if(sharpx[i]) {
				for(int j=0;j<W;j++) {
					if(sharpy[j]) {
						System.out.print(a[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
}