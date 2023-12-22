import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			ArrayList<Double> per = new ArrayList<Double>();
			ArrayList<String> names = new ArrayList<String>();
			for(int k = 0; k < n; k++){
				String name = sc.next();
				//System.out.println(k + name);
				//P0 A1 B2 C3 D4 E5 F6 S7 M8
				int[] v = new int[9];
				for(int i = 0; i < 9; i++){
					v[i] = sc.nextInt();
					//System.out.println(i + " " + v[i]);
				}
				//f*s*m - p
				int income = v[6]*v[7]*v[8] - v[0];
				//a + b + c + m*(d+e)
				int time = v[1] + v[2] + v[3] + v[8]*(v[4] + v[5]);
				double p = (double)income / (double)time;
				//System.out.println(name + " = " + p);

				//pの値に応じて入れる
				int size = per.size();
				int j;
				for(j = 0; j < size; j++){
					double tmp = per.get(j);
					if(p > tmp){
						break;
					}
					else if(p == tmp){
						if(name.compareTo(names.get(j)) < 0){
							break;
						}
					}
				}
				per.add(j, p);
				names.add(j, name);
			}
			int len = names.size();
			for(int k = 0; k < len; k++){
				System.out.println(names.get(k));
			}
			System.out.println("#");
			n = sc.nextInt();
		}
	}
}