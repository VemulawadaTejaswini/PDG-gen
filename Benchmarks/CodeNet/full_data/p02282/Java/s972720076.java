import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] pre = new int[n];
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; ++i) {
			 pre[i] = Integer.parseInt(str[i]);
		}
		
		int[] in = new int[n];
		str = br.readLine().split(" ");
		for(int i = 0; i < n; ++i) {
			 in[i] = Integer.parseInt(str[i]);
		}

		// make post and print
		System.out.println(post(pre, in));
	}
	public static String post(int[] pre, int[] in) {
		// search centre
		int i = 0;
		int n = pre.length;
		while(pre[0] != in[i]){
			i += 1;
		}
		
		String str = "";
		
		// left
		// num of left element = i
		if(i == 0){
			str += "";
		}else if(i == 1){
			str += String.valueOf(in[0]);
		}else{
			str += post(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
		}
		
		// right
		int nr = n - 1 - i;// num of right element == 1
		if(nr == 0){
			str += "";
		}else if(nr == 1){ 
			str += " " + String.valueOf(in[n - 1]);
		}else{
			str += post(Arrays.copyOfRange(pre, 1 + i, pre.length), Arrays.copyOfRange(in, i + 1, pre.length));
		}
		
		// centre
		str += " " + String.valueOf(in[i]); // or pre[0]
		
		return str;
	}
}