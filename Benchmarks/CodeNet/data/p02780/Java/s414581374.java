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
		float result = 0;
		float max = 0;
		for(int i = 0; i < p.length; i++){
			p[i] = (float)(1+scanner.nextInt())/2;
			addlist.add(p[i]);
			if(i<k){
				result+=p[i];
			}else{
				result+=p[i]-addlist.get(0);
				addlist.remove(0);
			}
//			System.out.println(result + " : " + p[i]);
			max = Math.max(result, max);
		}


		System.out.println(max);
	}

}
