import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char [][] field = new char[H][W];
		for(int i=0;i<H;i++){
				field[i]=sc.next().toCharArray();
		}
		for(int i=0;i<H;i++){
			int Answer = -1;
			for(int j=0;j<W;j++){
				if(field[i][j]=='c'){
					Answer=0;
				}else if(Answer!=0){
					Answer++;
				}
				System.out.print(Answer);
				if(j!=W-1) System.out.print(" ");
			}
			System.out.println("");
		}
	}
}