import java.util.Scanner;
public class Main {

	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		  int H = sc.nextInt();
		  int W = sc.nextInt();
		  char[][] a = new char[H][W];
		  char[][] ans = new char[H][W];
		  char[][] ans2 = new char[H][W];
		  int ansi = 0;
		  int ansj = 0;

		  for(int i = 0; i < H ; i++) {
			  a[i] = sc.next().toCharArray();
		  }
		  //白行を見つける
		  for(int i = 0; i < H; i++) {
			  int count = 0;
			  for(int j = 0; j < W ; j ++) {
				  if(a[i][j]=='.') count++;
				  }
			  if(count != W) {
				  for(int j = 0; j < W ; j++) {
					  ans[ansi][j] = a[i][j];
				  }
				  ansi++;
			  }
		  }
		  for(int j = 0; j < W; j++) {
			  int count = 0;
			  for(int i = 0; i < ansi ; i ++) {
				  if(a[i][j]=='.') count++;
				  }
			  if(count != ansi) {
				  for(int i = 0; i < W ; i++) {
					  ans2[i][ansj] = ans[i][j];
				  }
				  ansj++;
			  }
		  }
		  //白列を削除する

		  //出力する
		  for(int i = 0; i < ansi; i++) {
			  for(int j = 0; j < ansj; j++) {
				  System.out.print(ans2[i][j]);
			  }
			  System.out.println("");
		  }

		  sc.close();
	  }
}