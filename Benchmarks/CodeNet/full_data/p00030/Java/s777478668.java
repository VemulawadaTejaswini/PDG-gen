
import java.util.Scanner;
 
class Main {
     static int n, s;
     static int[] nums = {0,1,2,3,4,5,6,7,8,9};
     static int mm (int sum, int i, int cnt) {
        if (cnt == n) return sum == s ? 1 : 0;
        if (sum > s || i >= nums.length) return 0;
        return mm(sum + nums[i], i + 1, cnt + 1) +
               mm(sum, i + 1, cnt);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while (true) {
            n = sc.nextInt();
            s = sc.nextInt();
            if (s == 0 && n == 0) break;
            System.out.println(mm(0,0,0));
        }
 
    }
 
}