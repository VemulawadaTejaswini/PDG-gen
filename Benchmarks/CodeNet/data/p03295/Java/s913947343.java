
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        final int m = scanner.nextInt();
        final List<Bridge> bridges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            bridges.add(new Bridge(a, b));
        }

        bridges.sort((x, y) -> y.b - x.b);
        final Set<Bridge> brokenBridges = new HashSet<>();
        for (final Bridge bridge : bridges) {
            final Bridge brokenBridge = new Bridge(bridge.b - 1, bridge.b);
            brokenBridges.add(brokenBridge);
        }

        System.out.println(brokenBridges.size());
    }

    static class Bridge {
        int a;
        int b;

        Bridge(final int a, final int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(final Object obj) {
            final Bridge bridge = (Bridge) obj;
            return bridge.a == this.a && bridge.b == this.b;
        }

        @Override
        public int hashCode() {
            return a * 100000 + b;
        }
    }
}
