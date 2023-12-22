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
	 	int yen = 1000;
	 	int i = 0;
	 	int min = array.get(0);
	 	int sum = 0;
	 	int max = 0;
	 	
	 	while(i< n){
	 		max = 0;
	 		int startindex = i+0;
	 		while(i < n-1 && array.get(i) <= array.get(i+1)){
	 			i++;
	 		}
	 		for(int j = startindex;j<i;j++){
	 			max = Math.max(max,  yen/array.get(j)*(array.get(i)-array.get(j)));
	 		}
	 		i++;
	 		yen+=max;
	 	}
 		out.println(yen);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


