import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 2016/08/13.
 */
public class Main {
    private static final int NUM = 30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] nums = new int[str.length()];
        for(int i=0; i< str.length(); i++){
            nums[i] = (int)(str.charAt(i)) - ((int)'a');
        }

        for(int i=0; i<str.length()-1; i++){
            int num = nums[i];
            int currentMax = 1;
            int[] array = new int[NUM];
            Arrays.fill(array, 0);

            for(int j=i+1; j<str.length(); j++){
                int diff = j - i;
                int judge = (j - i) / 2;
                if(diff%2==0){
                    judge++;
                }else{
                    judge+=2;
                }

                array[nums[j]]++;
                currentMax = Math.max(currentMax, array[nums[j]]);

                if(currentMax >= judge){
                    System.out.println((i+1) + " " + (j+1));
                }

                if((diff+1) - currentMax > 2){
                    break;
                }
            }
        }

        System.out.println("-1 -1");
    }
}
