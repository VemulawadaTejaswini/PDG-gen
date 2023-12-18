import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = array[i] + array[j];
                int a = binarySearch(array, sum) - 1;
                // System.out.println(binarySearch(array, sum));
                answer += a - j;
            }
        }
        System.out.println(answer);
    }
    
    public static int binarySearch(int[] array, int target) {
        int index = -1;
        int left = 0;
        int right = array.length;
    
        while (left < right) {
            int center = (left + right) / 2;
            if (array[center] == target) {
                index = center + 1;
                break;
            } else if (array[center] > target) {
                right = center;
            } else if (array[center] < target) {
                left = center + 1;
            }
            
        }
        
        if (left == right) {
            index = left;
        }
        return index;
    }
}
