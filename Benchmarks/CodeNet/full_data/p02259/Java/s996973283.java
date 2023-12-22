
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        String[] a = sc.nextLine().split(" ");
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(a[i]);
        }

        int changeCount = 0;

        boolean loopFlg = true;
        while (loopFlg) {
            loopFlg = false;
            for (int i = num - 1; i >= 1; i--) {
                if (array[i] < array[i-1]) {
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    changeCount++;
                    loopFlg = true;
                }
            }
    
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i!=array.length-1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println(changeCount);
    }
}

/**
1 bubbleSort(A, N) // N 個の要素を含む 0-オリジンの配列 A
2   flag = 1 // 逆の隣接要素が存在する
3   while flag
4     flag = 0
5     for j が N-1 から 1 まで
6       if A[j] < A[j-1]
7         A[j] と A[j-1] を交換
8         flag = 1

入力例 1
5
5 3 2 4 1
出力例 1
1 2 3 4 5
8
 */
