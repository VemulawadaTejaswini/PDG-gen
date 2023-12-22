import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		long[][] coords = new long[n][2];
 		for(int j = 0;j<n;j++){
 			StringTokenizer st = new StringTokenizer(bf.readLine());
 			coords[j][0] = Integer.parseInt(st.nextToken());
 			coords[j][1] = Integer.parseInt(st.nextToken());
 		}
 		long max = 0;
 		int index = 0;
 		for(int j = 1;j<n;j++){
 			if ( (long)(Math.abs(coords[j][0] - coords[0][0])) + (long)(Math.abs(coords[j][1] - coords[0][1])) > max){
 				max = (long)(Math.abs(coords[j][0] - coords[0][0])) + (long)(Math.abs(coords[j][1] - coords[0][1]));
 				index = j;
 			}
 		}
 		long amax = 0;
 		int index2 = 0;
 		for(int j = 0;j<index;j++){
 			if ( (long)(Math.abs(coords[j][0] - coords[index][0])) + (long)(Math.abs(coords[j][1] - coords[index][1])) > amax){
 				amax = (long)(Math.abs(coords[j][0] - coords[index][0])) + (long)(Math.abs(coords[j][1] - coords[index][1]));
 				index2 = j;
 			}

 		}
 		for(int j = index+1;j<n;j++){
 			if ( (long)(Math.abs(coords[j][0] - coords[index][0])) + (long)(Math.abs(coords[j][1] - coords[index][1])) > amax){
 				index2 = j;
 				amax = (long)(Math.abs(coords[j][0] - coords[index][0])) + (long)(Math.abs(coords[j][1] - coords[index][1]));
 			}
 		}
 		
 		
 		long amaxx = 0;
 		for(int j = 0;j<index2;j++){
 			if ( (long)(Math.abs(coords[j][0] - coords[index2][0])) + (long)(Math.abs(coords[j][1] - coords[index2][1])) > amaxx){
 				amaxx = (long)(Math.abs(coords[j][0] - coords[index2][0])) + (long)(Math.abs(coords[j][1] - coords[index2][1]));
 			}

 		}
 		for(int j = index2+1;j<n;j++){
 			if ( (long)(Math.abs(coords[j][0] - coords[index2][0])) + (long)(Math.abs(coords[j][1] - coords[index2][1])) > amaxx){
 				amaxx = (long)(Math.abs(coords[j][0] - coords[index2][0])) + (long)(Math.abs(coords[j][1] - coords[index2][1]));
 			}
 		}
 		out.println(amaxx);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


