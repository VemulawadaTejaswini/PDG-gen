import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);

	 	StringTokenizer st = new StringTokenizer(bf.readLine());
	 	int n = Integer.parseInt(st.nextToken());
	 	int m = Integer.parseInt(st.nextToken());
	 	int k = Integer.parseInt(st.nextToken());
	 	StringTokenizer st1 = new StringTokenizer(bf.readLine());
	 	StringTokenizer st2 = new StringTokenizer(bf.readLine());
 		LinkedList<Integer> array1 = new LinkedList<Integer>();
 		LinkedList<Integer> array2 = new LinkedList<Integer>();
 		for(int i = 0;i<n;i++){
 			array1.add(Integer.parseInt(st1.nextToken()));
 		}
 		array1.add(Integer.MAX_VALUE);
 		for(int i = 0;i<m;i++){
 			array2.add(Integer.parseInt(st2.nextToken()));
 		}
 		array2.add(Integer.MAX_VALUE);
 		
 		int books = 0;
 		long time = 0;
 		while(time + Math.min(array1.get(0), array2.get(0))<=k){
 			if (array1.get(0) < array2.get(0)){
 				books++;
 				time+= array1.get(0);
 				array1.remove(0);
 			}
 			else{
 				books++;
 				time+= array2.get(0);
 				array2.remove(0);
 			}
 		}
 		
 		out.println(books);
	 		
 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


