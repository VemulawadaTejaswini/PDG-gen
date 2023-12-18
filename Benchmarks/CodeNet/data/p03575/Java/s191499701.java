import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    private static int solveAll(List<Integer> vertices, Set<int[]> nodes)
    {
        int count = 0;
        for (int[] bridge : nodes) {
            boolean result = solve(new ArrayList<>(vertices), nodes, bridge, 1);
//            System.out.println(String.format("bridge=%s, result=%s", Arrays.toString(bridge), result));
            if (!result) {
                count++;
            }
        }
        return count;
    }

    private static boolean solve(ArrayList<Integer> vertices, Set<int[]> nodes, int[] bridge, int cur)
    {
        if (!vertices.contains(cur)) {
            return false;
        }

        vertices.remove(Integer.valueOf(cur));

        if (vertices.isEmpty()) {
            return true;
        }

        for (int[] node : nodes) {
            if (Arrays.equals(node, bridge)) {
                continue;
            }

            if (node[0] == cur) {
                if (solve(vertices, nodes, bridge, node[1])) {
                    return true;
                }
            }
            else if (node[1] == cur) {
                if (solve(vertices, nodes, bridge, node[0])) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<int[]> nodes = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int[] node = new int[2];
            node[0] = scanner.nextInt();
            node[1] = scanner.nextInt();
            nodes.add(node);
        }

        ArrayList<Integer> vertices = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            vertices.add(i);
        }

        System.out.println(solveAll(vertices, nodes));
    }
}

