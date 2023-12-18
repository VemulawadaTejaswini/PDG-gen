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

		List<Job> list = new ArrayList<>();
		for(int i = m-1;i>=0;i--) {
			for(int j=0;j<jobs.size();j++) {
				if(m-i==jobs.get(j).day) {
					list.add(jobs.get(j));
					jobs.remove(j);
				}else {
					break;
				}
			}
			list.sort((a,b)->b.money-a.money);
			
			if(list.size()>0) {
				score += list.get(0).money;
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