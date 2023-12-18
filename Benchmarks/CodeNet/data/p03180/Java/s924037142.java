import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[][] points = new int[count][count];
        for (int i = 0; i < count; ++i) {
            String[] parts = reader.readLine().split(" ");
            for (int j = 0; j < count; ++j) {
                points[i][j] = Integer.parseInt(parts[j]);
            }
        }

        List<Integer> groups = new ArrayList<>();
        groups.add(0);
        long[] groupScores = new long[1 << count];

        for (int i = 0; i < count; ++i) {
            List<Integer> newGroups = new ArrayList<>(groups.size() * 2);
            for (int group : groups) {
                long score = groupScores[group];
                for (int j = 0; j < i; ++j) {
                    if ((group & (1 << j)) != 0) {
                        score += points[i][j];
                    }
                }
                int newGroup = group | (1 << i);
                groupScores[newGroup] = score;
                newGroups.add(group);
                newGroups.add(newGroup);
            }
            groups = newGroups;
        }

        ArrayDeque<Step> steps = new ArrayDeque<>();
        steps.add(new Step(0, 0, 0));
        long[] splitScores = new long[1 << count];

        while (!steps.isEmpty()) {
            Step step = steps.removeFirst();
            int groupBoth = step.first | step.second | (1 << step.pos);
            splitScores[groupBoth] = Math.max(
                    splitScores[groupBoth],
                    groupScores[step.first | (1 << step.pos)] + splitScores[step.second]);

            if (step.pos + 1 < count) {
                steps.addLast(new Step(step.first | (1 << step.pos), step.second, step.pos + 1));
                steps.addLast(new Step(step.first, step.second | (1 << step.pos), step.pos + 1));
                steps.addLast(new Step(step.first, step.second, step.pos + 1));
            }
        }

        System.out.println(splitScores[(1 << count) - 1]);
    }

    public static class Step {
        int first;
        int second;
        int pos;

        public Step(int first, int second, int pos) {
            this.first = first;
            this.second = second;
            this.pos = pos;
        }
    }
}
