import java.util.*;
public class Main {
    
    public static boolean dfs(int i, int[] nums, List<Integer> left, List<Integer> right)
    {
        // System.out.println(i+" "+left.toString()+" "+right.toString());
        if(i==10)
        {
            // System.out.println("final");
            for(int j=1;j<left.size(); j++)
            {
                if(left.get(j-1) > left.get(j))
                    return false;
            }
            for(int j=1;j<right.size(); j++)
            {
                if(right.get(j-1) > right.get(j))
                    return false;
            }
            return true;
        }
        if(left.size() > 0 && right.size() > 0 && nums[i] < left.get(left.size()-1) && nums[i] < right.get(right.size()-1))
        {
            // System.out.println("test");
            return false;
        }
    
        boolean left_flag = false;
        if((left.size() > 0 && nums[i] > left.get(left.size()-1)) || left.size() == 0)
        {
            left.add(nums[i]);
            left_flag= dfs(i+1, nums, left, right);
        }
        if(left_flag)
            return true;
        if(left.size() > 0)
            left.remove(left.size()-1);
        boolean right_flag = false;
        if((right.size() > 0 && nums[i] > right.get(right.size()-1)) || right.size() == 0)
        {
            right.add(nums[i]);
            right_flag = dfs(i+1, nums, left, right);
            if(right.size() > 0)
                right.remove(right.size()-1);
        }
        return right_flag;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int[] nums = new int[10];
            for(int j=0;j<10;j++)
            {
                nums[j] = sc.nextInt();
            }
            // for(int j=0;j<10;j++)
                // System.out.println(nums[i]);
            List<Integer> left = new ArrayList<Integer>();
            List<Integer> right = new ArrayList<Integer>();
            boolean flag = dfs(0, nums, left, right);
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}

