
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        final int m = scanner.nextInt();
        final List<IslandRelation> islandRelations = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            islandRelations.add(new IslandRelation(a, b));
        }

        islandRelations.sort(Comparator.comparingInt(x -> x.west));

        final Set<Integer> brokenBridges = new HashSet<>();
        int previousBrokenBridge = islandRelations.get(0).east - 1;
        brokenBridges.add(previousBrokenBridge);
        for (final IslandRelation islandRelation : islandRelations) {
            if (islandRelation.west < previousBrokenBridge) {
                continue;
            }

            previousBrokenBridge = islandRelation.east -1;
            brokenBridges.add(previousBrokenBridge);
        }

        System.out.println(brokenBridges.size());
    }

    static class IslandRelation {
        int west;
        int east;

        IslandRelation(final int west, final int east) {
            this.west = west;
            this.east = east;
        }
    }
}
