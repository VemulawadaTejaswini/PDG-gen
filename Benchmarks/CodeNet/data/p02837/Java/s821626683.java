
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final Saying[] sayings = new Saying[n];

        for (int i = 0; i < n; i++) {
            final int a = scanner.nextInt();
            final PersonAndHonest[] personAndHonestArray = new PersonAndHonest[a];
            for (int j = 0; j < a; j++) {
                final int x = scanner.nextInt() - 1;
                final boolean isHonest = scanner.nextInt() == 1;
                personAndHonestArray[j] = new PersonAndHonest(x, isHonest);
            }
            sayings[i] = new Saying(personAndHonestArray);
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, bfs(i, sayings));
        }

        System.out.println(max == -1 ? 0 : max);
    }

    private static int bfs(final int number, final Saying[] sayings) {
        final Deque<Integer> queue = new ArrayDeque<>();
        queue.add(number);
        final Set<Integer> honestSet = new HashSet<>();
        final Set<Integer> liarSet = new HashSet<>();

        while (queue.size() > 0) {
            final Integer index = queue.pollFirst();
            honestSet.add(index);
            final PersonAndHonest[] array = sayings[index].array;
            for (final PersonAndHonest personAndHonest : array) {
                if (personAndHonest.isHonest) {
                    if (liarSet.contains(personAndHonest.person)) {
                        return -1;
                    } else if (!honestSet.contains(personAndHonest.person)) {
                        queue.add(personAndHonest.person);
                    }

                    honestSet.add(personAndHonest.person);
                } else {
                    if (honestSet.contains(personAndHonest.person)) {
                        return -1;
                    }
                    liarSet.add(personAndHonest.person);
                }
            }
        }

        return honestSet.size();
    }

    static class Saying {
        final PersonAndHonest[] array;

        Saying(final PersonAndHonest[] array) {
            this.array = array;
        }
    }

    static class PersonAndHonest {
        final int person;
        final boolean isHonest;

        PersonAndHonest(final int person, final boolean isHonest) {
            this.person = person;
            this.isHonest = isHonest;
        }
    }
}
