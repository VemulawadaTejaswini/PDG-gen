import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
// Get numbers
        int n = input.nextInt();
        int[] nums = new int[n];

// fill array
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        insertSort(n, nums);
    }

    public static void insertSort(int n, int[] nums){
        for(int i = 1; i<= nums.length-1; i++){
            printHelp(nums);
            int key = nums[i];
            // insert A[i] into the sorted sequence A[0,...,j-1]
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        printHelp(nums);
    }

    private static void printHelp(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.print(nums[nums.length-1] + "\n");
    }
}
