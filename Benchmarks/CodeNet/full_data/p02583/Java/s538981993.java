import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);

//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		int n = Integer.parseInt(bf.readLine());
	 		ArrayList<Integer> array = new ArrayList<Integer>();
	 		StringTokenizer st2 = new StringTokenizer(bf.readLine());
	 		for(int j=0;j<n;j++){
	 			array.add(Integer.parseInt(st2.nextToken()));
	 		}
	 		int count = 0;
	 	for(int i = 0;i<n;i++){
	 		for(int j = i+1;j<n;j++){
	 			for(int k = j+1;k<n;k++){
	 				if ((long)(array.get(i))+(long)(array.get(j)) > (long)(array.get(k)) && (long)(array.get(i))+(long)(array.get(k)) > (long)(array.get(j)) && (long)(array.get(k))+(long)(array.get(j)) > (long)(array.get(i))){
	 					if (array.get(i) != array.get(j) && array.get(j) != array.get(k) && array.get(i) != array.get(k))
	 						count++;
	 				}
	 			}
	 		}
	 	}
 		
 		out.println(count);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


