import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] array1 = new int[n/2];
        int[] array2 = new int[n/2];
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = num;
            if(i % 2 == 0) {
                array1[index1] = num;
                index1++;
            } else {
                array2[index2] = num;
                index2++;
            }
        }
        boolean isSameNums = true;
        int prev = array[0];
        for(int i = 0; i < n; i++) {
            if(prev != array[i]) {
                isSameNums = false;
                break;
            }
            prev = array[i];
        }
        if(isSameNums) {
            System.out.println(n/2);
            return;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int maxCount1 = 0;
        int maxCount2 = 0;
        int count1 = 1;
        int count2 = 1;
        int prevNum1 = array1[0];
        int prevNum2 = array2[0];
        for(int i = 1; i < n/2; i++) {
            if(prevNum1 == array1[i]) {
                count1++;
            } else {
                count1 = 1;
                prevNum1 = array1[i];
            }
            if(prevNum2 == array2[i]) {
                count2++;
            } else {
                count2 = 1;
                prevNum2 = array2[i];
            }
            maxCount1 = Math.max(maxCount1, count1);
            maxCount2 = Math.max(maxCount2, count2);
        }
        System.out.println((n/2 - maxCount1) + (n/2 - maxCount2));
    }
}