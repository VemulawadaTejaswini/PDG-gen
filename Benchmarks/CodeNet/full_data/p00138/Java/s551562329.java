import java.util.Arrays;
import java.util.Scanner;
public class Main{

	/**
	 * @param args
	 */
	
	class AOJ_0138 implements Comparable<AOJ_0138>{
		Integer num;
		Double time;
		
		public int compareTo(AOJ_0138 o){
			return time.compareTo(o.time);
		}
	}
	
	void doIt(){
		int m = 0;
		Scanner sc = new Scanner(System.in);
		AOJ_0138[] data = new AOJ_0138[8];
		AOJ_0138[] sub = new AOJ_0138[18];
		for(int i=0; i<3; i++){
			for(int k=0; k<8; k++){
				data[k] = new AOJ_0138();
				data[k].num = sc.nextInt();
				data[k].time = sc.nextDouble();
			}
			Arrays.sort(data);
			System.out.printf("%d %.2f\n", data[0].num, data[0].time);
			System.out.printf("%d %.2f\n", data[1].num, data[1].time);
			for(int k=2; k<8; k++, m++){
				sub[m] = data[k];
			}
		}
		Arrays.sort(sub);
		System.out.printf("%d %.2f\n", sub[0].num, sub[0].time);
		System.out.printf("%d %.2f\n", sub[1].num, sub[1].time);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		new Main().doIt();
		
	}

}