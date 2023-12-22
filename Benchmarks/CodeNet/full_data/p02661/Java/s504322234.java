import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		ArrayList<Integer> ai = new ArrayList<Integer>();
 		ArrayList<Integer> bi = new ArrayList<Integer>();
 		for(int i = 0;i<n;i++){
 			StringTokenizer st = new StringTokenizer(bf.readLine());
 			ai.add(Integer.parseInt(st.nextToken()));
 			bi.add(Integer.parseInt(st.nextToken()));
 		}
 		Collections.sort(ai);
		Collections.sort(bi);
 		if (n%2 == 1){
 			
 			out.println(bi.get(bi.size()/2)-ai.get(ai.size()/2)+1);
 			out.close();
 		}
 		else{
 			double b = (ai.get(ai.size()/2) + ai.get(ai.size()/2-1)+0.0)/2;
 			double c = (bi.get(bi.size()/2) + bi.get(bi.size()/2-1)+0.0)/2;
 			out.println((int)(2*(c-b)+1));
 			out.close();
 		}

	}

}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


