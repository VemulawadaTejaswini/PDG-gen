import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n;
        int[][] graph = new int[size][size];

        while (n-- > 0) {
            int row = sc.nextInt() - 1;
            int item = sc.nextInt();
            while (item-- > 0) {
                graph[row][sc.nextInt() - 1] = 1;
                //printArr(graph, size);
            }
        }
        printArr(graph, size);
    }

    static void printArr(int[][] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
