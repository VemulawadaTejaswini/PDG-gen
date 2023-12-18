import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int nth = input.nextInt();

        String[] starter = {"1","2","3","4","5","6","7","8","9","10"};
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(starter));
        if(nth>10){
            int i=0;
            while(nums.size()<=nth) {
                if(i==0){
                    nums.add(nums.get(i)+nums.get(i));
                    nums.add(nums.get(i)+nums.get(i+1));
                }else{
                    nums.add(nums.get(i)+nums.get(i-1));
                    nums.add(nums.get(i)+nums.get(i));
                    nums.add(nums.get(i)+nums.get(i+1));
                }
                i++;
            }
        }
        System.out.println(nums.get(nums.size()-1));
    }
}
