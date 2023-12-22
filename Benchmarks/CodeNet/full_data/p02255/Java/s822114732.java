import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] rank = new int[n];
		String[] str = (br.readLine()).split(" ");
		for (int i = 0; i < n ; i++ ) {
			rank[i] = Integer.parseInt(str[i]);
		}
		//??°????????????
		for (int i = 0;  i<n ; i++ ) {
			if ( i < n-1) {
				System.out.print(rank[i]+" ");
			}else{
				System.out.println(rank[i]);
			}


		}

		int key;
		//sort
		for ( int i = 1; i <= rank.length-1 ; i++ ) {
			key = rank[i];
			int j = i-1;
			while(j>=0 && rank[j]>key){
				rank[j+1] = rank[j];
				j--;
				rank[j+1] = key;
			}
		//output
			for (int k = 0;  k<n ; k++ ) {
				if ( k < n-1) {
					System.out.print(rank[k]+" ");
				}else{
					System.out.println(rank[k]);
				}


			}
		}
	}
}