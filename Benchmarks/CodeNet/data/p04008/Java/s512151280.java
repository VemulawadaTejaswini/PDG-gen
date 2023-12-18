import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String [] input1 = br.readLine().split(" ");
		int N = Integer.parseInt(input1[0]);
		long K = Long.parseLong(input1[1]);
		String []input2 =br.readLine().split(" ");
		int center = 1;
		int changeCount = 0;
		if(Integer.parseInt(input2[0])!= 1) {
			input2[0]= "1";
			changeCount++;
		}
		while(true) {
			boolean notChange = false;
			int temp = center;
			for(int i=0;i<K;i++) {
				int ii = Integer.parseInt(input2[temp]);
				if(ii==1) {
					notChange = true;
					break;
				}else {
					temp = Integer.parseInt(input2[temp])-1;
				}
			}
			if(!notChange) {
				input2[center] = "1";
				changeCount++;
			}
			center++;
			if(center == N) {
				break;
			}
		}
		System.out.println(changeCount);
	}

}