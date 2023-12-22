import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			int n;
			Boolean nosol = true;
			
			while((line=r.readLine()).indexOf('0')<0){
				n = Integer.parseInt(line);
				int[][] m = new int[n][n];
				int[] shortindex = new int[n];//index of the shortest student in each row 
				
				//create matrix
				for(int k=0;k<n;k++){
					line=r.readLine();
					String[] temp = line.split(" ");
					int min = m[k][0];
					
					for(int j=0;j<n;j++){
						int t = Integer.parseInt(temp[j]);
						m[k][j] = t;
						//record shortest index for each row
						if(t<min){
							min = t;
							shortindex[k] = j;
						}
					}
				}
				
				//look for the tallest student in each column
				for(int j=0;j<n;j++){
					int max = m[0][j],tallindex=0;
					for(int k=0;k<n;k++){
						if(m[k][j]>max){
							max = m[k][j];
							tallindex = k;
						}
					}
					if(j == shortindex[tallindex]){
						System.out.println(m[tallindex][j]);
						nosol = false;
						break;
					}
				}

				if(nosol){
					System.out.println("0");
				}
				nosol = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}