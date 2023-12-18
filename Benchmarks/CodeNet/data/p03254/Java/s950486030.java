import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		String [] input1 = br.readLine().split(" ");
		String [] input2 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		int x = Integer.parseInt(input1[1]);
		Arrays.sort(input2);
		int result = 0;
		boolean endFlag = false;
		for(int i=0;i<N;i++) {
			int child = Integer.parseInt(input2[i]);
			x -=child;
			result++;
			if(x < 0) {
				int ii = i;
				for(int j=0;j<N;j++) {
					result--;
					if(ii - 1 < 0 || (((x + Integer.parseInt(input2[ii])) % (Integer.parseInt(input2[ii-1]))) == 0) ) {
						endFlag = true;
						break;
					}
				}
			}else if(x == 0) {
				endFlag = true;
			}
			if(endFlag) {
				break;
			}
		}
		System.out.println(result);
	}
}