import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] nums = new int[4];
        int[][] ops = {{1,1,1},{1,1,-1},{1,-1,1},{-1,1,1},{1,-1,-1},{-1,1,-1},{-1,-1,1},{-1,-1,-1}};
        char[][] opss = {{'+','+','+'},{'+','+','-'},{'+','-','+'},{'-','+','+'},{'+','-','-'},{'-','+','-'},{'-','-','+'},{'-','-','-'}};
        for (int i = 0 ; i < 4 ; i++) {
            nums[i] = Character.getNumericValue(s.charAt(i));
        }
        for (int i = 0 ; i < 8 ; i++) {
            if (nums[0] + nums[1] * ops[0][i] + nums[2] * ops[1][i] + nums[3] * ops[2][i] == 7) {
                System.out.println(nums[0]+String.valueOf(opss[0][i])+nums[1]+String.valueOf(opss[1][i])+nums[2]+String.valueOf(opss[2][i])+nums[3]+"=7");
                System.exit(0);
            }
        }
    }
}