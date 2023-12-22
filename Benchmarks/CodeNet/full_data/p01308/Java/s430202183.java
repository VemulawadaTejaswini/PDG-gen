import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final String[] octave = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
	public static String[] step;
	public static String[] song;
	public static int m;
	public static int n;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();

	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int numOfData = sc.nextInt();
		
		for(int i = 0; i < numOfData; i++){
			n = sc.nextInt();
			m = sc.nextInt();
			if(n == 0 || m == 0){
				System.out.println("No");
			}
			//String[] step = new String[n];
			step = new String[n];

			for(int j = 0; j < n; j++){
				step[j] = sc.next();
			}
			//String[] song = new String[m];
			song = new String[m];
			
			for(int j = 0; j < m; j++){
				song[j] = sc.next();
			}
			boolean bRet = isOK(-1,-1);
			if(bRet){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			//System.out.println("result = " + bRet);
		}
	}
	//今配列[k]段目にいて、曲は配列[index]番目まで出来ている
	public static boolean isOK(int k, int index){
		//System.out.println("isOK : k = " + k + ", index = " + index);
		boolean bRet = false;
		//特殊な場合の処理
		if(index == m - 1){
			//曲完成
			if(k + 1 == n || k + 2 == n){
				//System.out.println("kansei");
				bRet = true;
			}
		}
		else{
			if(k + 2 < n && check(k, 2, index+1)){
				//if(k + 2 <= n){
					bRet = isOK(k + 2, index+1);
				//}
				
			}
			else if(k + 1 < n && check(k, 1, index+1)){
				//if(k + 1 <= n){
					bRet = isOK(k + 1, index+1);
				//}
			}
			//-1
			else if(k > 0 && check(k, -1, index+1)){
				//if(k != 1){
					bRet = isOK(k - 1, index+1);
				//}
			}
		}

		return bRet;
	}
	//now + num番目の音を鳴らしたときにsong[index]と等しいか？
	public static boolean check(int now, int num, int index){
		//System.out.println("check : now = " + now + ", num = " + num + ", index = " + index);
		boolean bRet = false;
		String s = ring(now,num);
		//System.out.println(s);
		if(song[index].equals(s)){
			bRet = true;
		}
		//System.out.println("bRet = " + bRet);
		return bRet;
	}
	public static String ring(int now, int num){
		//System.out.println("ring : now = " + now + ", num = " + num);
		int i = now + num;
//		if(i == -1){
//			i = 11;
//		}
		String ret = step[i];
		if(num == 2){
			//半音あげる
			for(int j = 0; j < 12; j++){
				if(step[i].equals(octave[j])){
					j++;
					ret = octave[j % 12];
					break;
				}
			}
		}
		else if(num == -1){
			//半音下げる
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