import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.next().split("");
        for (int i = 0; i < 8; i++) {
            String bin = Integer.toString(i, 2);
            if (getSum(bin, nums))break;
        }
    }

    private static boolean getSum(String bin, String[] nums){
        if (bin.length() == 1) bin = "00"+bin;
        else if (bin.length() == 2) bin = "0"+bin;
        int sum = Integer.parseInt(nums[0]);
        StringBuilder ans = new StringBuilder(nums[0]);
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0'){
                sum += Integer.parseInt(nums[i + 1]);
                ans.append("+").append(nums[i + 1]);
            }
            else{
                ans.append("-").append(nums[i + 1]);
                sum -= Integer.parseInt(nums[i + 1]);
            }
        }

        if (sum == 7) {
            ans.append("=7");
            System.out.println(ans);
        }
        return sum == 7;
    }
}
