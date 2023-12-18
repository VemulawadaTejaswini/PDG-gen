import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] dice = new int[n];
		float[] p = new float[n];
		for(int i = 0; i < dice.length; i++){
			dice[i] = scanner.nextInt();
			p[i] = (float)(1+dice[i])/2;
		}
		List<Float> addlist = new ArrayList<Float>();
		float[] sumset = new float[n];
		for(int i = k-1; i < p.length;i++){
			if(i == k-1){
				for(int j = 0; j < k; j++){
					addlist.add(p[j]);
					sumset[i] += p[j];
				}
			}else{
				sumset[i] = sumset[i-1]-addlist.get(0);
				addlist.remove(0);
				addlist.add(p[i]);
				sumset[i] += addlist.get(addlist.size()-1);
			}
		}

//		for(float s: sumset){
//			System.out.println(s);
//		}


		float result = 0;
		for(float s : sumset){
			result = Math.max(result, s);
		}

		System.out.println(result);
	}

}
