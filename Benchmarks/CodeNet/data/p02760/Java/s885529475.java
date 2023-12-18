import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        Collection<Collection<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            lines.add(List.of(a[i][0],a[i][1],a[i][2]));
            lines.add(List.of(a[0][i],a[1][i],a[2][i]));
        }
        lines.add(List.of(a[0][0],a[1][1],a[2][2]));
        lines.add(List.of(a[0][2],a[1][1],a[2][0]));


        boolean[][] b = new boolean[3][3];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            for (Collection<Integer> line : lines) {
                line.remove(b);
                if(line.isEmpty()){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}