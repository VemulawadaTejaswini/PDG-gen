import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int[] arr = new int[m];
    for (int i = 0; i < m; i++) {
        arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);
    reverse(arr);
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    System.out.println(sum);
}

public static void reverse(int[] arr) {

    for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
//对数组的元素进行位置交换
        int temp = arr[min]; //定义了一个什么都没有的变量 保存下标为min的元素 然后min就空了
        arr[min] = arr[max];
        arr[max] = temp;
    }
}
}