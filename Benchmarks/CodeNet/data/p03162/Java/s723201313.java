import java.io.*;
import java.util.*;
 
public class Main {
	
	public static final int CONSTANTE = 3;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line1 = Integer.parseInt(br.readLine());
		int[][] array = new int[line1][CONSTANTE];
		
		for(int i = 0; i < line1 ; i++) {
			String[] S = br.readLine().split(" ");
			array[i][0] = Integer.parseInt(S[0]);
			array[i][1] = Integer.parseInt(S[1]);
			array[i][2] = Integer.parseInt(S[2]);
		}
		int[] array1 = new int[CONSTANTE];
		int[] array2 = new int[CONSTANTE];
		
		for(int i = 0; i < CONSTANTE; i++) {
			array1[i] = array[0][i];
		}
		System.out.println(metodo(line1, array, array1, array2));
	}
	
	public static int metodo(int number, int[][] a, int[] array, int[] array1) {
		
		for(int i = 1; i < number ; i++) {
			for(int j = 0; j < CONSTANTE; j++) {
				for(int k = 0; k < CONSTANTE; k++) {
					if(j == k) continue;
					array1[j] = Math.max(array1[j], a[i][j]+ array[k]);
				}
			}
			array = array1;
			array1 = new int[CONSTANTE];
		}
		
	
		return Math.max(array[0], Math.max(array[1], array[2]));
	}
}