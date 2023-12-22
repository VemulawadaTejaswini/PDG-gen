import java.util.*;
import java.math.*;
import java.io.*;
public class Main {
 
	public static void main(String[] args) throws Exception{
		int num = 998244353;
 
		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
//	 	
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		ArrayList<BigInteger> array = new ArrayList<BigInteger>();
 		for(int i = 0;i<n;i++){
 			array.add(new BigInteger(st.nextToken()));
 			if (array.get(i).equals(0)){
 				out.println(0);
 				out.close();
 			}
 		}
 		BigInteger prod = new BigInteger("1");
 		
 		for(int i = 0;i<n;i++){
 			prod = prod.multiply(array.get(i));
 			if (prod.compareTo(new BigInteger("1000000000000000000")) > 0){
 				out.println(-1);
 				out.close();
 				break;
 			}
 		}
 		out.println(prod);
 		
 		out.close();
 		
 		
 		
 	}
}
