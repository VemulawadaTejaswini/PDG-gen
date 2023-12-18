import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Box[] boxes = new Box[n];

        for (int i = 0; i < n; i++) {
            boxes[i] = new Box();
        }
        boxes[0].red = 1;
        boxes[0].white = 0;
        boxes[0].isPossible = true;

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            boxes[y].red += boxes[x].red;
            boxes[y].white += boxes[x].white;

            boxes[x].num--;
            boxes[y].num++;

            if (boxes[x].num == 0) {
                boxes[x].red = 0;
                boxes[y].white = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (boxes[i].red > 0) count++;
        }

        System.out.println(count);
    }

    private static class Box {
        int num = 1;
        int red = 0;
        int white = 1;
        boolean isPossible = false;
    }
}