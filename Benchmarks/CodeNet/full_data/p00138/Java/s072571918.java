import java.util.*;

public class Main {
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Record round[] = new Record[24]; //??????
		Record qualified[] = new Record[6]; //?±??????????????£????(3, 4???)
		Record finalist[] = new Record[8]; //?±?????????????
		int m = 0, n = 0;
		for(int i = 0; i < 24; i++){
			round[i] =  new Record(sc.nextInt(), sc.nextDouble());
		}
		/*for(int i = 0; i < 24; i += 8){
			int k = i + 8;
			Arrays.sort(round, i, k);
		}*/
		for(int i = 0; i < 24; i += 8){
			Arrays.sort(round, i, i + 8);
			finalist[m] = round[i]; m++;
			finalist[m] = round[i + 1]; m++;
			qualified[n] = round[i + 2]; n++;
			qualified[n] = round[i + 3]; n++;
		}
		Arrays.sort(qualified, 0, 6);
		finalist[m] = qualified[0]; m++;
		finalist[m] = qualified[1];
		/*for(int i = 0; i < 24; i++){
			System.out.printf("%d %.2f\n", round[i].number, round[i].time);
		}*/
		//System.out.println(Arrays.toString(round).replaceAll("\\[|\\]|,", ""));
		for(int i = 0; i < 8; i++){
			System.out.printf("%d %.2f\n", finalist[i].number, finalist[i].time);
		}
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
	class Record implements Comparable<Record>{ //Record???????????????
		int number;
		double time;
		Record(int number, double time){
			this.number = number;
			this.time = time;
		}
		/*@Override
		public String toString(){
			return number + " " + time;
		}*/
		@Override
		public int compareTo(Record r){
			return new Double(time).compareTo(r.time);
		}
	}
}