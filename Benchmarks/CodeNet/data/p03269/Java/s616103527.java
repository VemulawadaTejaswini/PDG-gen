import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int l = Integer.parseInt(tmpArray[0]);
		
		int powers[] = new int[20];
		int m = 0;
		int sum = 0;
		for(int i = 0; i < 20; i++){
			powers[i] = (int)Math.pow(2, i);
			sum += powers[i];
//			System.out.print(powers[i] + " ");
			
			if(sum <= l){
				m = i;
			}
		}
		
//		System.out.println("m = "+m);
		StringBuffer sb = new StringBuffer();
		int d = 0;
		for(int i = 0; i <= m; i++){
			sb.append((i + 1)+" "+(i + 2) +" "+powers[i]+"\n");
			sb.append((i + 1)+" "+(i + 2) +" "+0+"\n");
			d += 2;
		}
		
		System.out.println((m + 2) + " "+d);
		
		System.out.print(sb);
		
	}
	
}