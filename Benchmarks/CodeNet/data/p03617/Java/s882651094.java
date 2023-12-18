import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[5];
        for(int i=0;i<5;i++){
            nums[i] = sc.nextInt();
        }
        nums[0] *= 4;
        nums[1] *= 2;
        nums[3] /= 2;
        double min = nums[3];
        int num = 3;
        for(int i=0;i<3;i++){
            if(min<=nums[i]){
                min = nums[i];
                num = i;
            }
        }
        if(num!=3){
            System.out.println((int)nums[4]*min);
            return;
        }
        double minl = nums[0];
        int numl = 0;
        for(int i=1;i<2;i++){
            if(minl<=nums[i]){
                minl = nums[i];
                numl = i;
            }
        }
        int sum = 0;
        sum += nums[3]*2*((int)nums[4]/2);
        int res = (int)nums[4];
        sum += (res%2)*minl;
        System.out.println(sum);
        
    }
}
