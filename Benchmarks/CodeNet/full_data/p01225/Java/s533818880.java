import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int[] red = new int[9];
		int[] blue = new int[9];
		int[] green = new int[9];
		int r, g, b;
		int[] numR = new int[10];
		int[] numG = new int[10];
		int[] numB = new int[10];
		char c;
		int count;
		int t = sc.nextInt();
		for(int k = 0; k < t; k++){
			r = 0;
			g = 0;
			b = 0;
			for(int i = 1; i <= 9; i++){
				numR[i] = 0;
				numG[i] = 0;
				numB[i] = 0;
			}
			count = 0;
			for(int i = 0; i < 9; i++)
				n[i] = sc.nextInt();
			for(int i = 0; i < 9; i++){
				c = sc.next().charAt(0);
				switch(c){
				case 'R':
					red[r] = n[i];
					r++;
					break;
				case 'G':
					green[g] = n[i];
					g++;
					break;
				case 'B':
					blue[b] = n[i];
					b++;
					break;
				default:
					System.out.println("Error");
					i = -1;
					break;
				}
			}
			sort(numR, red, r);
			sort(numG, green, g);
			sort(numB, blue, b);
			count += set(numR) + set(numG) + set(numB);			
			System.out.println(count == 3 ? 1 : 0);
		}
	}
	static void sort(int[] num, int[] n, int m){
		for(int i = 0; i < m; i++){
			for(int j = 1; j <= 9; j++){
				if(n[i] == j)
					num[j]++;
			}
		}
	}
	static int set(int[] num){
		int count = 0;
		for(int i = 1; i <= 9; i++){
			for(int k = 0; k < 3; k++){
				if(num[i] >= 3){
					num[i] -= 3;
					count++;
				}else
					break;
			}
		}
		for(int i = 1; i <= 7; i++){
			if(num[i] >= 1 && num[i+1] >= 1 && num[i+2] >= 1){
				num[i]--;
				num[i+1]--;
				num[i+2]--;
				count++;
				i = 0;
			}
		}
		return count;
	}
}