import java.util.*;
import java.io.*;
public class Main {
	static ArrayList<ArrayList<Integer>> perms = new ArrayList<ArrayList<Integer>>();
	static int n;
	static int m;
	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		n = Integer.parseInt(st.nextToken());
 		m = Integer.parseInt(st.nextToken());
 		int q = Integer.parseInt(st.nextToken());
 		int[][] quadruples = new int[q][4];
 		for(int i = 0;i<q;i++){
 			StringTokenizer st1 = new StringTokenizer(bf.readLine());
 			int a = Integer.parseInt(st1.nextToken());
 			int b = Integer.parseInt(st1.nextToken());
 			int c = Integer.parseInt(st1.nextToken());
 			int d = Integer.parseInt(st1.nextToken());
 			quadruples[i][0] = a;
 			quadruples[i][1] = b;
 			quadruples[i][2] = c;
 			quadruples[i][3] = d;
 				
 		}
 		for(int i =1;i<=m;i++){
 			ArrayList<Integer> te = new ArrayList<Integer>();
 			te.add(i);
 			recur(te);
 		}
 		int max = 0;
 		for(ArrayList<Integer> i : perms){
 			int count = 0;
 			for(int j = 0;j<q;j++){
 				if (i.get(quadruples[j][1]-1) - i.get(quadruples[j][0]-1) == quadruples[j][2])
 					count+=quadruples[j][3];
 			}
 			max = Math.max(count, max);
 		}
 		out.println(max);
 		out.close();
 		
 	}
	public static void recur(ArrayList<Integer> temp){
		if(temp.size() == n){
			perms.add((ArrayList<Integer>)temp.clone());
		}
		else{
			for(int i = temp.get(temp.size()-1);i<=m;i++){
				temp.add(i);
				recur(temp);
				temp.remove(temp.size()-1);
			}
		}
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


