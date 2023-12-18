import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Job> jobs = new ArrayList<>();


		//double temp =0;
		//List<Double> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Job job = new Job(sc.nextInt(),sc.nextInt());
			jobs.add(job);
		}

		jobs.sort((a,b) -> a.day-b.day);

		int score = 0;

		List<Integer> list = new ArrayList<>();

		for(int i = 1;i<m+1;i++) {
			while(jobs.size()>0) {
					if(jobs.get(0).day==i) {
						list.add(jobs.get(0).money);
						jobs.remove(0);
						list.sort((a,b)->b-a);
					}else {
						break;
					}

			}


			if(list.size()>0) {
				score += list.get(0);
				list.remove(0);
			}

		}
		System.out.println(score);
	}

}

class Job{
	int day;
	int money;
	Job(int day, int money){
		this.day = day;
		this.money = money;
	}
}