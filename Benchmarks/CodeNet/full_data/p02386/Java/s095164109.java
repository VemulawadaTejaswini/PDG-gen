import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static String[] x;
	static String[] y;
	static String temp;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] dice3 = new int [num][6];

		for(int i = 0; i < num; i++){
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < 6; j++){
				dice3[i][j] = Integer.parseInt(str[j]);
			}
		}
		char[] c = { 'E', 'E', 'E', 'N', 'W', 'W', 'W', 'S' };

		boolean flag = false;
		for(int i = 0; i < 3; i++){
			for(char d : c){
				roll(d);
				if(Arrays.equals(x, y)){//??????????????£??????true????????????
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
	public static void roll(char c) {
		switch (c) {
		case 'E'://????????????????????¢????????¨?????????????????????
			temp = x[0];
			x[0] = x[3];
			x[3] = x[5];
			x[5] = x[2];
			x[2] = temp;
			break;
		case 'N':
			temp = x[0];
			x[0] = x[1];
			x[1] = x[5];
			x[5] = x[4];
			x[4] = temp;
			break;
		case 'W':
			temp = x[0];
			x[0] = x[2];
			x[2] = x[5];
			x[5] = x[3];
			x[3] = temp;
			break;
		default:
			temp = x[0];
			x[0] = x[4];
			x[4] = x[5];
			x[5] = x[1];
			x[1] = temp;
			break;
		}
	}
}