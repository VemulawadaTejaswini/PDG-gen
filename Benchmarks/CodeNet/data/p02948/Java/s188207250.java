import java.util.Scanner;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int jobCount = scanner.nextInt();
		int days = scanner.nextInt();
		int result = 0;
		Map<Integer, Integer> applicableJobs = new HashMap<>();
		for(int i = 0; i < jobCount; i++) {
			int payoutDays = scanner.nextInt();
			int salary = scanner.nextInt();
			if (payoutDays > days) continue; // skip the job that won't pay out
			if (applicableJobs.containsKey(payoutDays)) {
				int currentSalary = applicableJobs.get(payoutDays);
				if (salary > currentSalary) {
					applicableJobs.put(payoutDays, salary);
					for(int j = days; j > payoutDays; j--) {
						if(!applicableJobs.containsKey(j) || applicableJobs.get(j) < currentSalary) {
							applicableJobs.put(j, currentSalary);
							break;
						}
					}
				} else {
					for(int j = days; j > payoutDays; j--) {
						if(!applicableJobs.containsKey(j) || applicableJobs.get(j) < salary) {
							applicableJobs.put(j, salary);
							break;
						}
					}
				}
			} else {
				applicableJobs.put(payoutDays, salary);
			}
		}
		Collection<Integer> values = applicableJobs.values();
		for (Integer value : values) {
			result += (long) value;
		}
		System.out.println(result);
	}
}