
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        final MyList[] myLists = new MyList[n + 1];
        for (int i = 1; i <= n; i++) {
            myLists[i] = new MyList();
        }
        for (int i = 0; i < m; i++) {
            final int left = scanner.nextInt();
            final int right = scanner.nextInt();
            final int distance = scanner.nextInt();
            myLists[left].add(new Distance(right, distance));
            myLists[right].add(new Distance(left, -distance));
        }

        final boolean[] isVisited = new boolean[n + 1];
        final int[] distances = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (isVisited[i]) {
                continue;
            }

            isVisited[i] = true;
            distances[i] = i;

            if (!dfs(isVisited, distances, i, myLists)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean dfs(final boolean[] isVisited, final int[] distances, final int start, final MyList[] myList) {
        isVisited[start] = true;
        for (final Distance distance : myList[start]) {
            if (isVisited[distance.destination] && distances[distance.destination] != distances[start] + distance.distance) {
                return false;
            }

            if (!isVisited[distance.destination]) {
                distances[distance.destination] = distances[start] + distance.distance;
                return dfs(isVisited, distances, distance.destination, myList);
            }
        }

        return true;
    }

    static class MyList extends ArrayList<Distance> {
    }

    static class Distance {
        int destination;
        int distance;

        public Distance(int destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }
}
