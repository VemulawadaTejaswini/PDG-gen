import java.io.*;
import java.util.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		 String str = bf.readLine();
		 Integer[] result = new Integer[5];
		 String[] deta = str.split(" ",0);
		 for(int i = 0; i < deta.length; i++){
			 result[i] = Integer.parseInt(deta[i]);
		 }
		 Arrays.sort(result,Collections.reverseOrder());
		 for(int i = 0; i < result.length; i++){
			 System.out.println(result[i]);
		 }
	}
}