import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int r, g, b;
		char c;
		int count;
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			int[] red = new int[9];
			int[] blue = new int[9];
			int[] green = new int[9];
			int[][] R = new int[10][10];
			int[][] G = new int[10][10];
			int[][] B = new int[10][10];
			int[] numR = new int[10];
			int[] numG = new int[10];
			int[] numB = new int[10];
			r = 0;
			g = 0;
			b = 0;
			count = 0;
			for(int j = 0; j < 9; j++)
				n[j] = sc.nextInt();
			for(int j = 0; j < 9; j++){
				c = sc.next().charAt(0);
				switch(c){
				case 'R':
					red[r] = n[j];
					r++;
					break;
				case 'G':
					green[g] = n[j];
					g++;
					break;
				case 'B':
					blue[b] = n[j];
					b++;
					break;
				default:
					System.out.println("Error");
					j = -1;
					break;
				}
			}
			sort(R, numR, red, r);
			sort(G, numG, green, g);
			sort(B, numB, blue, b);
			count += count(R, numR) + count(G, numG) + count(B, numB);			
			System.out.println(count == 3 ? 1 : 0);
		}
	}
	static void sort(int[][] C, int[] numC, int[] color, int c){
		for(int i = 0; i < c; i++){
			for(int j = 1; j <= 9; j++)
				if(color[i] == j){
					C[j][++numC[j]] = 1;
			}
		}
	}
	static int count(int[][] C, int[] numC){
		int count = 0;
		for(int i = 1; i <= 9; i++){
			for(int k = 0; k < 3; k++){
				if(numC[i] >= 3){
					numC[i] -= 3;
					count++;
				}else
					break;
			}
			for(int j = numC[i]+1; j <= 9; j++)
				C[i][j] = 0;
		}
		for(int j = 1; j <= 2; j++){
			for(int i = 1; i <= 7; i++){
				if(C[i][j] == 1 && C[i+1][j] == 1 && C[i+2][j] == 1){
					count++;
					i += 2;
				}
			}
		}
		return count;
	}
}