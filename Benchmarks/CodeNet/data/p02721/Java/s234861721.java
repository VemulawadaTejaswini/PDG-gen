import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        String S = sc.next();
        StringBuffer sb = new StringBuffer(S);
        String S_ = sb.reverse().toString();
        List<Integer> workDaysL = new ArrayList<Integer>();
        List<Integer> workDaysR = new ArrayList<Integer>();
        for (int d: calcWorkDays(S, C).subList(0, K)) {
            workDaysL.add(d+1);
        }
        for (int d: calcWorkDays(S_, C).subList(0, K)) {
            workDaysR.add(N-d);
        }
        for (int d: workDaysL) {
            if (workDaysR.contains(d)) {
                System.out.println(d);
            }
        }
    }

    public static List<Integer> calcWorkDays(String s, int c) {
        List<Integer> workDays = new ArrayList<Integer>();
        int count = 0;
        while (count < s.length()) {
            if (s.charAt(count) == 'o') {
                workDays.add(count);
                count += c+1;
            } else {
                count++;
            }
        }
        return workDays;
    }
}