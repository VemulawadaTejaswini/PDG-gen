import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        long[] array1 = new long[n/2];
        long[] array2 = new long[n/2];
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < n; i++) {
            long num = sc.nextInt();
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
        long prev = array[0];
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
        long maxCount1 = 0;
        long maxCount2 = 0;
        long count1 = 1;
        long count2 = 1;
        long prevNum1 = array1[0];
        long prevNum2 = array2[0];
        long maxNum1 = 0;
        long maxNum2 = 0;
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
            if(maxCount1 <= count1) {
                maxNum1 = array1[i];
                maxCount1 = count1;
            }
            if(maxCount2 <= count2) {
                maxNum2 = array2[i];
                maxCount2 = count2;
            }
        }

        if(maxNum1 == maxNum2) {
            if (maxCount1 <= maxCount2) {
                count1 = 1;
                maxCount1 = 0;
                prevNum1 = -1;
                for (int i = 0; i < n / 2; i++) {
                    if (array1[i] == maxNum1) {
                        continue;
                    } else {
                        if (prevNum1 == array1[i]) {
                            count1++;
                        } else {
                            count1 = 1;
                            prevNum1 = array1[i];
                        }
                    }
                    maxCount1 = Math.max(maxCount1, count1);
                }
            } else {
                count2 = 1;
                maxCount2 = 0;
                prevNum2 = -1;
                for (int i = 0; i < n / 2; i++) {
                    if (array2[i] == maxNum2) {
                        continue;
                    } else {
                        if (prevNum2 == array2[i]) {
                            count2++;
                        } else {
                            count2 = 1;
                            prevNum2 = array2[i];
                        }
                    }
                    maxCount2 = Math.max(maxCount2, count2);
                }
            }
        }
        System.out.println((n/2 - maxCount1) + (n/2 - maxCount2));
    }
}