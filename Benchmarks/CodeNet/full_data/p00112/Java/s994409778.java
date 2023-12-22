import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int s = Integer.parseInt(in.readLine());
			if(s == 0){
				break;
			}
			else{
				int[] is = new int[s];
				for(int i = 0;i<s;i++){
					is[i] = Integer.parseInt(in.readLine());
				}
				Arrays.sort(is);
				int as = 0;
				long a = 0;
				for(int i = 0 ;i < s-1;i++){
					as = as + is[i];
					a = a +as;
				}
				System.out.println(a);
			}
			
			
		}

	}

}