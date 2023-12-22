import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final String[] octave = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	public static String[] step;
	
	public static int n;
	public static final String START = "start";
	public static final String GOAL = "goal";
	public static void main(String[] args) {
		doIt();

	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int numOfData = sc.nextInt();
		
		for(int i = 0; i < numOfData; i++){
			n = sc.nextInt();
			int m = sc.nextInt();
			//String[] step = new String[n];
			step = new String[n];

			for(int j = 0; j < n; j++){
				step[j] = sc.next();
			}
			//String[] song = new String[m];
			String[] song = new String[m];
			
			for(int j = 0; j < m; j++){
				song[j] = sc.next();
			}
			//n段目にいるときに鳴らせる音一覧
			String[][] stepTable = new String[n + 1][3];
			//make StepTable
			for(int j = 0; j <= n; j++){
				//k - 1
				stepTable[j][0] = ring(j - 1,-1);
				//k + 1
				stepTable[j][1] = ring(j - 1,1);
				//k + 2
				stepTable[j][2] = ring(j - 1,2);
			}
			//printStepTable();
			
			int point = 0;
			//dp[i]ターンまでの曲が作れる
			int[] dp = new int[n + 1];
			for(int j = 0; j < n + 1; j++){
				dp[j] = -1;
			}
			//始めは0段目にいる
			dp[0] = 0;
			int start = 0;
			int end = 0;
			//長さmの曲を作る
			for(int h = 0; h < m; h++){
				//残りの曲の長さは(m - h)
				//よって、n - ((m-h)+1)*2から始めれば十分。そうでなければ到達できない
//				int start = n - (m - h + 1)*2;
//				if(start < 0){
//					start = 0;
//				}
				//System.out.println(start);
				int tmp_start = n + 1;
				int tmp_end = 0;
				for(int j = start; j <= end; j++){
					if(dp[j] == h){
						for(int k = 0; k < 3; k++){
							if(song[h].equals(stepTable[j][k])){
								int index;
								if(k == 0){
									index = j - 1;
									dp[index] = h + 1;
								}
								else if(k == 1){
									index = j + 1;
									dp[index] = h + 1;
								}
								else{
									index = j + 2;
									dp[index] = h + 1;
								}
								if(tmp_start > index){
									tmp_start = index;
								}
								if(tmp_end < index){
									tmp_end = index;
								}
							}
						}
					}
				}
				start = tmp_start;
				end = tmp_end;
			}
			
			if(dp[n] == m || dp[n - 1] == m){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
//	public static void printStepTable(){
//		for(int i = 0; i <= n; i++){
//			System.out.println("step[" + i +  "]" + stepTable[i][0] + ", " + stepTable[i][1] + ", " + stepTable[i][2]);
//		}
//	}

	public static String ring(int now, int num){
		//System.out.println("ring : now = " + now + ", num = " + num);
		int i = now + num;
		if(i < 0){
			return START;
		}
		else if(i >= n){
			return GOAL;
		}
		String ret = step[i];
		if(num == 2){
			for(int j = 0; j < 12; j++){
				if(step[i].equals(octave[j])){
					j++;
					ret = octave[j % 12];
					break;
				}
			}
		}
		else if(num == -1){
			for(int j = 0; j < 12; j++){
				if(step[i].equals(octave[j])){
					j--;
					if(j == -1){
						j = 11;
					}
					ret = octave[j];
					break;
				}
			}
		}
		//System.out.println("ring : now = " + now + ", num = " + num + ", ret = " + ret);
		return ret;
	}
}