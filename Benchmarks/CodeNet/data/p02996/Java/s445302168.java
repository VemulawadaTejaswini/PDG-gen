import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long amount, deadline;
		List<Job> jobList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			amount = Long.parseLong(sc.next());
			deadline = Long.parseLong(sc.next());
			jobList.add(new Job("Job" + (i + 1), amount, deadline));
		}

		Collections.sort(jobList, Comparator.comparing(Job::getDeadline));
		String ans = solve(jobList) ? "Yes" : "No";
		System.out.println(ans);
	}

	static boolean solve(List<Job> jobList) {
		long current = 0;
		for (int i = 0; i < jobList.size(); i++) {
			current += jobList.get(i).amount;
			if (current > jobList.get(i).deadline) {
				return false;
			}
		}
		return true;
	}

}

class Job {
	String jobName;
	long amount;
	long deadline;

	Job(String jobName, long amount, long deadline) {
		this.jobName = jobName;
		this.amount = amount;
		this.deadline = deadline;
	}

	public String getJobName() {
		return jobName;
	}

	public long getAmount() {
		return amount;
	}

	public long getDeadline() {
		return deadline;
	}

	public String toString() {
		return jobName + " , " + amount + " , " + deadline;
	}
}