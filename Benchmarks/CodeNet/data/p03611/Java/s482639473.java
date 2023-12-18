import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100001];
        int countMinus = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[num]++;
            array[num+1]++;
            if(num-1 == -1) {
                countMinus++;
            } else {
                array[num-1]++;
            }
        }
        int max = countMinus;
        for(int num: array) {
            max = Math.max(max, num);
        }
        System.out.println(max);
    }
}
