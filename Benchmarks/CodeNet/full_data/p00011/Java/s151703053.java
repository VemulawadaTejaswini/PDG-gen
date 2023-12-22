import java.util.Scanner;

public class Main{
	public static void swap(int[] m, int x, int y){
		int temp = m[x-1];
		m[x-1] = m[y-1];
		m[y-1] = temp;
	}
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int w = stdIn.nextInt();
		int[] m = new int[w];
		for(int i = 0; i < w; i++){
			m[i] = i+1;
		}
		int n = stdIn.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++){
			str[i] = stdIn.next();
		}
		String[][] s = new String[n][2];
		int[][] line = new int[n][2];
		for(int i = 0; i < n; i++){
			s[i] = str[i].split(",");
			line[i][0] = Integer.parseInt(s[i][0]);
			line[i][1] = Integer.parseInt(s[i][1]);
		}
		for(int i = 0; i < n; i++){
			swap(m,line[i][0],line[i][1]);
		}
		
		for(int i = 0; i < w; i++){
			System.out.println(m[i]);
		}
	}
}