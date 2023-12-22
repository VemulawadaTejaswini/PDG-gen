//WÎ·ðßévO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n != 0){
			int [] score = new int[n];
			int sum = 0;
			for(int i=0; i < n; i++){
				score[i] = sc.nextInt();
				sum += score[i];
			}
			double avg = (double) sum / (double) n;
			double sum2 = 0;
			for(int i=0; i < n; i++){
				sum2 += Math.pow((double)score[i] - avg, (double)2);
			}
			double avg2 = sum2 / (double)n;
			double stdev = Math.sqrt(avg2);
			System.out.printf("%1.8f\n",stdev);
			n = sc.nextInt();
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}