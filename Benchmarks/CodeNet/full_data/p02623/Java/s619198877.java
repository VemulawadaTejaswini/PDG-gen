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
	 	long k = Long.parseLong(st.nextToken());
	 	StringTokenizer st1 = new StringTokenizer(bf.readLine());
	 	StringTokenizer st2 = new StringTokenizer(bf.readLine());
 		LinkedList<Long> array1 = new LinkedList<Long>();
 		LinkedList<Long> array2 = new LinkedList<Long>();
 		for(int i = 0;i<n;i++){
 			array1.add(Long.parseLong(st1.nextToken()));
 		}
 		array1.add(Long.MAX_VALUE/2);
 		for(int i = 0;i<m;i++){
 			array2.add(Long.parseLong(st2.nextToken()));
 		}
 		array2.add(Long.MAX_VALUE/2);
 		
 		ArrayList<Long> prefix1 = new ArrayList<Long>();
 		prefix1.add(0L);
 		long sum = 0;
 		for(long i : array1){
 			sum+=i;
 			prefix1.add(sum);
 		}
 		ArrayList<Long> prefix2 = new ArrayList<Long>();
 		prefix2.add(0L);
 		sum = 0;
 		for(long i : array2){
 			sum+= i;
 			prefix2.add(sum);
 		}
 	
 		int i = 0;
 		int max = 0;
 		while(i < prefix2.size() && prefix2.get(i) <=k){
 			long left = k-prefix2.get(i);
 			int index = lowerBoundS(prefix1, left, 0, array1.size());
 			max = Math.max(index+i, max);
 			i++;
 		}
 		
	 	out.println(max);
 		
 		out.close();
 		
 		
 		
 	}
	//last index of integer less than or equal to target
		public static int lowerBoundS(ArrayList<Long> array, long target, int l, int r){
			if (array.size() == 1)
				return 0;
			int mid = -1;
			while (l<r){
				mid = (l+r)/2;
				if (array.get(mid)<= target && (mid + 1 >= array.size() || array.get(mid+1) > target))
					return mid;
				else if (array.get(mid) <= target)
					l = mid+1;
				else
					r = mid;
			}
			return mid;
			
		
		}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


