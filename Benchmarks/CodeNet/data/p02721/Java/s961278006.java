import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] days = sc.next().toCharArray();
        boolean[] work = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (days[i] == 'o')
                work[i] = true;
        }
        Integer[] workFast = new Integer[n];
        Integer[] workLater = new Integer[n];
        int workDays = k;
        Integer[] workNow = new Integer[n];
        int count = 0;
        for (int j = 0; j < n; j++) {
            if ((work[j]) && (workDays == k || j - workFast[count - 1] > c)) {
                workFast[count] = j;
                count++;
                workDays--;
            }
            if (workDays == 0)
                break;
        }
        workDays = k;
        count = 0;

        for (int a = n - 1; a >= 0; a--) {
            if ((work[a]) && (workDays == k || workLater[count - 1] - a > c)) {
                workLater[count] = a;
                count++;
                workDays--;
            }
            if (workDays == 0)
                break;
        }

        for (int i = 0; i < n; i++) {
            if (Arrays.asList(workFast).contains(i) && Arrays.asList(workLater).contains(i))
                System.out.println(i + 1);
        }
    }
}