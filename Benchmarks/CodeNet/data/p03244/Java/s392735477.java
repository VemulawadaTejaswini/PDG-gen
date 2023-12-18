import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//String string = scanner.next();
		int N = scanner.nextInt();
		int[] data1 = new int[N];
		int[] data2 = new int[N];
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		ArrayList<Integer> t2 = new ArrayList<Integer>();
		int ans1 = Integer.MAX_VALUE;
		int ans2 = Integer.MAX_VALUE;

		for(int i = 0;i < N;i++){			//データ入力
			if(i%2 == 0){
				data1[i] = scanner.nextInt();
				t1.add(data1[i]);
			}else{
				data2[i] = scanner.nextInt();
				t2.add(data2[i]);
			}
		}

		for(int i = 0;i < t1.size();i++){
			int k1 = t1.get(i);
			int sub = 0;
			for(int j = 0;j < N;j++){			//データ入力
				if(j%2 == 0){
					if(data1[j] != k1){
						sub++;
					}
				}
			}
			ans1 = Math.min(ans1,sub);

		}

		for(int i = 0;i < t2.size();i++){
			int k2 = t2.get(i);
			int sub = 0;
			for(int j = 0;j < N;j++){			//データ入力
				if(j%2 == 1){
					if(data2[j] != k2){
						sub++;
					}
				}

			}
			ans2 = Math.min(ans2,sub);

		}
		if(ans1 + ans2 == 0 && t1.get(0) == t2.get(0)){
			System.out.println(t1.size());
		}else if(ans1 + ans2 == 0 && t1.get(0) != t2.get(0)){
			System.out.println(0);
		}else{
			System.out.println(ans1 + ans2);

		}














	}
}

