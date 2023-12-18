import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input[] = br.readLine().split(" ");
		//[x][0] = ボールの個数  -1以上
		//[x][1] = 赤のボールがある 1 0
		//[x][2] = 赤のボールが入れられた 1 0
		int boxCount = Integer.parseInt(input[0]);
		int[][] box =new int [boxCount][3];
		for(int i=0;i<boxCount;i++) {
			for(int j=0;j<3;j++) {
				box[i][j]=0;
			}
		}
		box[0][1] = 1;
		int order = Integer.parseInt(input[1]);
		while(br.ready()) {
			String temp[] = br.readLine().split(" ");
			int before = Integer.parseInt(temp[0])-1;
			int after = Integer.parseInt(temp[1])-1;
			if(box[before][0] >= 0) {
				box[before][0]--;
				box[after][0]++;
				if(box[before][1]==1) {
					box[before][1] = 0;
					box[after][1] = 1;
					box[after][2] = 1;
				}
			}
		}
		int result = 0;
		for(int i =0 ;i<boxCount ; i++) {
			if(box[i][0] >= 0) {
				if(box[i][2] == 1) {
					result++;
				}
			}
		}
		if(result==0) {
			System.out.println(1);
		}else {
			System.out.println(result);
		}
	}

}