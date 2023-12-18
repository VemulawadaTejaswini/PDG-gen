import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] vertices = new Integer[N];

        for (int n = 0; n < N - 1; n += 1) {
            int u = Integer.parseInt(sc.next()) - 1;
            int v = Integer.parseInt(sc.next()) - 1;
            int w = Integer.parseInt(sc.next());

            Integer ui = vertices[u];
            Integer vi = vertices[v];

            if (ui == null && vi == null) {
                vertices[u] = 0;
                vertices[v] = w % 2 == 0 ? vertices[u] : reverse(vertices[u]);
            } else if (ui == null) {
                vertices[u] = w % 2 == 0 ? vi : reverse(vi);
            } else if (vi == null) {
                vertices[v] = w % 2 == 0 ? ui : reverse(ui);
            } else {
                continue;
            }
        }

        for (Integer vertex : vertices) {
            System.out.println(vertex);
        }
    }

    private static Integer reverse(Integer i) {
        if (i == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
