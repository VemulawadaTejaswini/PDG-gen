
import java.util.*;
public class Main {

	class Athlete implements Comparable<Athlete>{
		int num;
		double record;
		Athlete() {};
		Athlete(int num, double record) {
			this.num = num;
			this.record = record;
		}

		public int compareTo(Athlete as) {
			if(this.record < as.record){
				return -1;
			}
			if(this.record > as.record){
				return 1;
			}
			return 0;
		}

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		Athlete [][] array = new Athlete[3][8];
		for(int i=0; i < 3; i++){
			for(int j=0; j < 8; j++){
				int number = sc.nextInt();
				double time = sc.nextDouble();
				array[i][j] = new Athlete(number, time);
			}
			Arrays.sort(array[i]);
		}

		for(int i=0; i < 3; i++){
			System.out.printf("%d %1.2f\n",array[i][0].num,array[i][0].record);
			System.out.printf("%d %1.2f\n",array[i][1].num,array[i][1].record);
		}

		Athlete [] array2 = new Athlete[6];
		for(int i=0; i < 6; i+= 2){
			int number = array[i/2][2].num;
			double time = array[i/2][2].record;
			array2[i] = new Athlete(number,time);
			number = array[i/2][3].num;
			time = array[i/2][3].record;
			array2[i+1] = new Athlete(number,time);
		}
		Arrays.sort(array2);

		for(int i=0; i < 2; i++){
			System.out.printf("%d %1.2f\n",array2[i].num, array2[i].record);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}