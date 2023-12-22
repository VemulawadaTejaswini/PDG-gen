import java.io.*;
import java.util.*;

class Main {
	
	public static int[] rev_array(int[] array) {
		
		int[] res = new int[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			res[j++] = array[i];
		}
		return res;
	}
	
	public static int array_to_num (int[] num) {
		
		String str = "";
		for (int n : num) {
			str += String.valueOf(n);
		}
		return Integer.parseInt(str);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			
			String str = br.readLine();
			char[] c = str.toCharArray();
			int[] num  = new int[c.length];
			for (int j = 0; j < c.length; j++) {
				num[j] = c[j] - '0';
			}
			Arrays.sort(num);
			int[] num2 = rev_array(num);
			ans.add(array_to_num(num2) - array_to_num(num));
			
		}
		
		for (int a : ans)
			System.out.println(a);
		
	}
	
}