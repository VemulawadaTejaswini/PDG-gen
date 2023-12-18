import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<int[]> jobList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
        	int[] status = new int[2];
        	status[0] = input.nextInt();
        	status[1] = input.nextInt();
        	jobList.add(status);
        }

        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.valueOf(o1[1]).compareTo(Integer.valueOf(o2[1]));
            }
        };

        Collections.sort(jobList, comparator);

        long sum = 0;

        for (int[] job: jobList) {
        	sum += job[0];
        	if (job[1] - sum < 0) {
                System.out.println("No");
                return;
        	}
        }
        System.out.println("Yes");

    }
}
