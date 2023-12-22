import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> stack = new ArrayDeque<Integer>();
		String[] str = (br.readLine()).split(" ");
		int count = 0;
		for (int i = 0 ; i<n ; i++ ) {
			stack.addFirst(Integer.parseInt(str[i]));
		}
		int q = Integer.parseInt(br.readLine());
		String[] st = (br.readLine()).split(" ");
		for (int i = 0; i<q ; i++ ) {
			int num = Integer.parseInt(st[i]); 
			if (stack.remove(num)) {
				count++;
				try{
					while(stack.remove(num));
				}catch (NullPointerException e){
					break;
				}
			}
		}

		System.out.println(count);
	}
}