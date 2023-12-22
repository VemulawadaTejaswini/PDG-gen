import java.util.*;
public class Main {
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Record round[] = new Record[24];
		Record qualified[] = new Record[6];
		Record finalist[] = new Record[8];
		for(int i = 0; i < 24; i++){
			round[i] =  new Record(sc.nextInt(), sc.nextDouble());
		}
		finalist_search(round, qualified, finalist);
		for(int i = 0; i < 8; i++){
			System.out.printf("%d %.2f\n", finalist[i].number, finalist[i].time);
		}
	}
	void finalist_search(Record a[], Record b[], Record c[]){
		int m = 0, n = 0;
		for(int i = 0; i < 24; i += 8){
			Arrays.sort(a, i, i + 8);
			c[m] = a[i]; m++;
			c[m] = a[i + 1]; m++;
			b[n] = a[i + 2]; n++;
			b[n] = a[i + 3]; n++;
		}
		Arrays.sort(b, 0, 6);
		c[m] = b[0]; m++;
		c[m] = b[1];
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
	class Record implements Comparable<Record>{
		int number;
		double time;
		Record(int number, double time){
			this.number = number;
			this.time = time;
		}
		@Override
		public String toString(){
			return number + " " + time;
		}
		@Override
		public int compareTo(Record r){
			return new Double(time).compareTo(r.time);
		}
	}
}