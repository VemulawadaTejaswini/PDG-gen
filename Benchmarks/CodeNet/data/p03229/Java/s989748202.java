import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] odd = new int[n - n/2];
        int[] even = new int[n/2];
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int oddIndex = 0;
        int evenIndex = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                odd[oddIndex] = nums[i];
                oddIndex++;
            } else {
                even[evenIndex] = nums[i];
                evenIndex++;
            }
        }
        int[] newNums = new int[n];
        int middle = n - n/2; // start half right of array
        int count = 0;
        int evenStart = 0;
        int evenEnd = even.length-1;
        for(int i = middle; i < n; i++) {
            if(count % 2 == 0) {
                newNums[i] = even[evenEnd];
                evenEnd--;
            } else {
                newNums[i] = even[evenStart];
                evenStart++;
            }
            count++;
        }
        count = 0;
        int oddStart = 0;
        int oddEnd = odd.length-1;
        for(int i = middle-1; i >= 0; i--) {
            if(count % 2 == 0) {
                newNums[i] = odd[oddStart];
                oddStart++;
            } else {
                newNums[i] = odd[oddEnd];
                oddEnd--;
            }
            count++;
        }
        long sum = 0;
        int prev = newNums[0];
        for(int i = 1; i < n; i++) {
            int current = newNums[i];
            sum += Math.abs(prev - current);
            prev = current;
        }
        System.out.println(sum);
    }
}
