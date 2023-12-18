import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Problem[] problems = new Problem[n];
        for (int j = 0; j < n; j++) {
            int l = in.nextInt();
            int r = in.nextInt();
            problems[j] = new Problem(l, r);
        }
        Arrays.sort(problems);
        List<Problem> remProblems = new ArrayList<>(n);
        int maxL = 0;
        for (Problem problem : problems) {
            if (problem.l > maxL) {
                maxL = problem.l;
                remProblems.add(problem);
            }
        }
        if (remProblems.size() == 1) {
            Problem soleProblem = remProblems.get(0);
            int answer = 0;
            for (Problem problem : problems) {
                if (problem != soleProblem) {
                    answer = Math.max(answer, problem.r - problem.l + 1);
                }
            }
            answer += soleProblem.r - soleProblem.l + 1;
            System.out.println(answer);
            return;
        }
        PriorityQueue<Integer> maxL2 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minR2 = new PriorityQueue<>();
        for (Problem problem : remProblems) {
            maxL2.add(problem.l);
            minR2.add(problem.r);
        }
        int maxL1 = remProblems.get(0).l;
        int minR1 = remProblems.get(0).r;
        maxL2.remove(maxL1);
        minR2.remove(minR1);
        int answer = minR1 - maxL1 + 1 + Math.max(0, minR2.peek() - maxL2.peek() + 1);
        for (int j = 1; j < remProblems.size() - 1; j++) {
            Problem problem = remProblems.get(j);
            maxL2.remove(problem.l);
            minR2.remove(problem.r);
            maxL1 = problem.l;
            answer = Math.max(answer, Math.max(0, minR1 - maxL1 + 1) + Math.max(0, minR2.peek() - maxL2.peek() + 1));
        }
        System.out.println(answer);
    }

    static class Problem implements Comparable<Problem> {
        final int l;
        final int r;

        Problem(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(Problem o) {
            if (r != o.r) {
                return r - o.r;
            } else {
                return o.l - l;
            }
        }
    }
}
