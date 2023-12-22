import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    while(!line.equals("0")){
	        int n = Integer.parseInt(line);
	        int[] sum_arr = new int[n];
            int[][] table = new int[n+1][n+1];
	        for(int i=0;i<n;i++){
	            line = br.readLine();
	            String[] lines = line.split(" ");
	            int j=0;
	            int sum = 0;
	            for(String st:lines){
	                int tmp = Integer.parseInt(st);
	                table[i][j] = tmp;
	                sum += tmp;
	                sum_arr[j] += tmp;
	                ++j;
	            }
	            table[i][j] = sum;
	        }
	        int sum = 0;
	        for(int i=0;i<n;i++){
	            table[n][i] = sum_arr[i];
	            sum += sum_arr[i];
	        }
	        table[n][n] = sum;
	        
	        int length = Integer.toString(sum).length();
	        String fmt = "%" + length + "s";
	        for(int[] t:table){
	            for(int val:t){
	                System.out.print(String.format(fmt,Integer.toString(val)));
	                System.out.print(" ");
	            }
                System.out.println("");
	        }
            line = br.readLine();
	    }
	}
}