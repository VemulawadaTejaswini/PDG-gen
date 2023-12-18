import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[3];
        for(int i=0;i<3;i++)nums[i]=sc.nextInt();
        Arrays.sort(nums);
        int t=nums[2]*2-nums[1]-nums[0];
        System.out.println(t%2==0?t/2:t/2+2);
    }

}
