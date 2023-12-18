import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		float[] p = new float[n];
		List<Float> addlist = new ArrayList<Float>();
		float[] sumset = new float[n];
		float result = 0;
		for(int i = 0; i < p.length; i++){
			p[i] = (float)(1+scanner.nextInt())/2;

			if(i == k-1){
				for(int j = 0; j < k; j++){
					addlist.add(p[j]);
					sumset[i] += p[j];
				}
			}else if (i >k-1){
				sumset[i] = sumset[i-1]-addlist.get(0);
				addlist.remove(0);
				addlist.add(p[i]);
				sumset[i] += p[i];
			}else{
				sumset[i] = 0;
			}
			result = Math.max(result, sumset[i]);
		}


		System.out.println(result);
	}

}
