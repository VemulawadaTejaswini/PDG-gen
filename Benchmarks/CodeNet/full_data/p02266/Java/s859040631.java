import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		char line[] = tmp.toLowerCase().toCharArray();

		scanner.close();
		int startIndex =0;
		int lastIndex =0;
		//先頭が　\ の番号をチェック
		for(int i = 0; i < line.length; i++) {
			if("\\".equals(String.valueOf(line[i]))) {
				startIndex = i;
				break;
			}
		}
		//最後が　/ の番号をチェック
		for(int i = line.length -1; i >= 0; i--) {
			if("/".equals(String.valueOf(line[i]))) {
				lastIndex = i;
				break;
			}
		}

		//現在は面積計算対象かどうか
		boolean isLake = false;
		int depth = 0;
		//トータル水量
		double floods = 0;
		double flood = 0;
		//水たまり数
		int lakeNumber = 0;
		//各水たまりの面積
		double [] l = new double[3000];
		for (int j = startIndex; j <= lastIndex; j++) {
			String moji = String.valueOf(line[j]);
			//前から断面が変更になった場合 計算開始
			if("\\".equals(moji) && !isLake) {
				//同じ高さがあとから出てくる場合
				if(isSameHight(j,line)) {
 				    isLake = true;
				    //水量0.5+
				    floods += 0.5;
				    flood = 0.5;
				    lakeNumber++;
				    depth++;
				}
			} else if("\\".equals(moji) && isLake) {
				//水量0.5+
				floods += depth + 0.5;
				flood += depth + 0.5;
				depth++;
			} else if ("/".equals(moji) && (depth == 1)) {
			//下り断面と同等の高さになる場合
				isLake = false;
			    //次は0固定
				depth = 0;
				//水量0.5+
				floods += 0.5;
				flood += 0.5;
				l[lakeNumber - 1] = flood;
			} else if ("/".equals(moji) && (depth > 1)) {
				//先に１上昇
				depth--;
				//水量0.5+
				floods += depth + 0.5;
				flood += depth + 0.5;
			} else if ("_".equals(moji) && (depth > 0)) {
				//水量水深分+
				floods += depth;
				flood += depth;
			}

		}
		System.out.println((int)floods);
		System.out.print(lakeNumber);
		for (int x=0; x < lakeNumber; x++){
			System.out.print(" " + (int) l[x]);
		}
		System.out.println();
	}

	static boolean isSameHight(int fromvalue,char line[]) {
		int hight = 0;
		for (int i = fromvalue; i < line.length; i++) {
			String moji2 = String.valueOf(line[i]);
			if("\\".equals(moji2)) {
				hight ++;
			} else if ("/".equals(moji2)) {
				hight --;
				if(hight == 0) {
					return true;
				}
   		    }
		}
		return false;
	}
}


