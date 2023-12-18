import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String input = br.readLine();
//		int count = 0;
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i) == '1') count++;
//		}
//		System.out.println(count);
//		br.close();
		
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer valuesToks = new StringTokenizer(br.readLine(), " ");
		
		int[] values = new int[num];
		for(int i=0; i<num; i++) {
			values[i] = Integer.parseInt(valuesToks.nextToken());
		}
		
		int count = 0;
		while(true) {
			for(int i=0; i<values.length; i++) {
				if((values[i] % 2) == 0) {
					values[i] /= 2;
				} else {
					System.out.println(count);
					System.exit(0);
				}
			}
			count ++;
		}
		
		
		
	}

}
