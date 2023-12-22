import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		int len = str.length();
		int[] level = new int[len+1];
		int top = 0;
		int bottom = 0;
		int nowLevel = 0;

		for (int i=0; i<len; i++) {
			char c = str.charAt(i);
			level[i] = nowLevel;
			if (c == '\' || c == '\\') {
				nowLevel--;
			}else if(c == '/'){
				nowLevel++;
			}
			top = Math.max(top,nowLevel);
			bottom = Math.min(bottom,nowLevel);
		}
		level[len] = nowLevel;
		top = Math.max(top,nowLevel);
		bottom = Math.min(bottom,nowLevel);

		boolean[] water = new boolean[len];
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;

		for (int i=top; i>bottom; i--) {//高さ
			int start = -1;
			for (int j=0; j<len; j++) {//幅
				if (!water[j]) {//水は入っているか
					if ((start==-1?level[j]:level[j+1]) == i) {//levelの一致
						if (start == -1 && level[j]>level[j+1]) {//startが設定されているか '\'であるか
							start = j;
						}else if(start != -1){
							int count = 0;//傾斜数
							int vol = 0;
							for (int k=start; k<j+1; k++) {//面積計算
								vol += Math.abs(level[start] - Math.max(level[k],level[k+1]));
								if(Math.abs(level[k] - level[k+1]) > 0)
									count++;
								water[k] = true;//水を入れる
							}
							vol += count/2;
							sum += vol;//総面積に足す
							list.add(vol);
							start = -1;
						}
					}
				}
			}
		}

		System.out.println(sum);
		System.out.print(list.size());
		for (int i=0; i<list.size(); i++) {
			System.out.print(" "+list.get(i));
		}
		System.out.println();
	}
}