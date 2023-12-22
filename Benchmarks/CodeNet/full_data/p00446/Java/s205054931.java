import java.util.Scanner;
import java.io.*;

public class Main{
	public static int[] increase(int[] x){
		for(int i = 0; i < x.length; i++){
			int min = i;
			for(int j = i; j < x.length; j++){
				if( x[j] < x[min] ){
					min = j;
				}
			}
			int temp = x[i];
			x[i] = x[min];
			x[min] = temp;
		}
		return x;
	}
	
	public static int[] rule(int[] dataA, int[] dataB){
		int[] result = new int[2];
		int turn = 0;
		int countA = 0;
		int countB = 0;
		while( countA != dataA.length && countB != dataB.length ){
			int x = 0;
			for(int i = 0; i < dataA.length; i++){
				if( turn == 0 ){
					if( dataA[i] < x ){
						if( i == dataA.length-1 ){
							turn = 1;
							break;
						} else {
							continue;
						}
					} else {
						turn = 1;
						x = dataA[i];
						dataA[i] = -1;
						countA++;
						i = 0;
						if( countA == dataA.length ){
							break;
						}
					}
				}
				if( turn == 1 ){
					if( dataB[i] < x ){
						if( i == dataB.length-1 ){
							turn = 0;
							break;
						} else {
							continue;
						}
					} else {
						turn = 0;
						x = dataB[i];
						dataB[i] = -1;
						countB++;
						i = 0;
						if( countB == dataB.length ){
							break;
						}						
					}
				}
			}
		}
		
		if( countA == dataA.length ){
			result[0] = dataB.length-countB;
			result[1] = 0;
		} else {
			result[0] = 0;
			result[1] = dataA.length-countA;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[][] result = new int[100][2];
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			int index = 0;
			
			while( stdIn.hasNext() ){
				int n = -1;
				if( stdIn.hasNextInt() ){
					n = stdIn.nextInt();
				} else {
					stdIn.next();
				}
				if( n == 0 ){
					break;
				}
				int[] dataA = new int[n];
				int[] dataB = new int[n];
				int[] check = new int[2*n];
				for(int i = 0; i < n; i++){
					dataA[i]= stdIn.nextInt();
					check[dataA[i]-1] = 1;
				}
				int j = 0;
				for(int i = 0; i < n; i++){
					for(; j < 2*n; j++){
						if( check[j] == 0 ){
							dataB[i] = j+1;
							j++;
							break;
						}
					}
				}
				dataA = increase(dataA);
		/*		for(int i = 0; i < dataA.length; i++){
					System.out.println(dataA[i]);
				}
				for(int i = 0; i < dataB.length; i++){
					System.out.println(dataB[i]);
				}*/
				result[index] = rule(dataA, dataB);
				index++;
			}
			
			for(int i = 0; i < index; i++){
				System.out.println(result[i][0]);
				System.out.println(result[i][1]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}