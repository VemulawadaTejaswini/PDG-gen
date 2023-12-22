import java.util.*;
public class Main {
	static int [] namber = new int[200];
	public static int[] syokika(int[]namber){
		for(int i = 0; i < namber.length; i++){
			namber[i] = 0;
		}
		return namber;
	}
	public static int[][] hantei(int[][]array, int n, int j){
		int count = 1;
		namber = syokika(namber);
		for(int k = 1; k < n; k++) {
			for(int i = k + 1; i <= n; i++) {
				if(array[k][j] == array[i][j]) {
					namber[count] = array[k][j];
					count++;
				}
			}
		}
        for(int k = 1; k < namber.length;k++){
            for(int i = 1; i <= n; i++) {
            	if(namber[k] == array[i][j]){
            		array[i][j] = 0;
                }
            }
        }
         return array;
	}
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [][] array = new int [n+1][4];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for(int j = 1; j <= 3; j++){
        	array = hantei(array, n , j);
        }
        for(int i = 1; i <= n; i++) {
            int answer = 0;
            for(int j = 1; j <= 3; j++) {
                answer += array[i][j];
            }
            System.out.println(answer);
        }
    }
}