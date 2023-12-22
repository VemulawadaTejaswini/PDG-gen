import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();
		char[][] c=new char[H][W];

		for(int i=0;i<H;i++) {
			String s=sc.next();
			c[i]=s.toCharArray();
		}

		int answer=0;
    int blackcount=0;
		for(int h=0;h<(Math.pow(2, H));h++) {
			for(int w=0;w<(Math.pow(2, W));w++) {
				for(int row=0;row<H;row++) {
					for(int col=0;col<W;col++) {
						if(((h>>row & 1)==1) && ((w>>col & 1)==1)) {
							if (c[row][col] == '#')blackcount++;
						}
					}
				}
				if(blackcount==K)answer++;
			}
		}

	    System.out.println(answer);
	}
}
