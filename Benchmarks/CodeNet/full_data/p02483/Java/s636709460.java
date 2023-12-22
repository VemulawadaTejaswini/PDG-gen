import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] a) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int nums[] = new int[3];
		
		for (int i = 0; i < nums.length; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(nums);
		
		System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
	}
	
}