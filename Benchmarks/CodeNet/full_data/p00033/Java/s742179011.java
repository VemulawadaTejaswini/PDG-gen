import java.util.*;
public class Main {
    
    public static boolean dfs(int i, int[] nums, List<Integer> left, List<Integer> right)
    {
        // System.out.println(i);
        if(i==11)
        {
            // System.out.println(i);
            for(int j=2;j<left.size(); j++)
            {
                if(left.get(j-1) > left.get(j))
                    return false;
            }
            for(int j=2;j<right.size(); j++)
            {
                if(right.get(j-1) > right.get(j))
                    return false;
            }
            return true;
        }
        // System.out.println(left.toString()+" "+right.toString());
        if(nums[i-1] < left.get(left.size()-1) && nums[i-1] < right.get(right.size()-1))
            return false;
        boolean left_flag = false;
        if(nums[i-1] > left.get(left.size()-1))
        {
            left.add(nums[i-1]);
            left_flag= dfs(i+1, nums, left, right);
            if(left_flag)
                return true;
            left.remove(left.size()-1);
        }
    
        boolean right_flag = false;
        if(nums[i-1] > right.get(right.size()-1))
        {
            right.add(nums[i-1]);
            right_flag =  dfs(i+1, nums, left, right);
            if(right_flag)
                return true;
            right.remove(right.size()-1);
        }
        return false;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[10];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<10;j++)
            {
                nums[j] = sc.nextInt();
            }
            
            List<Integer> left = new ArrayList<Integer>();
            List<Integer> right = new ArrayList<Integer>();
            left.add(0);
            right.add(0);
            boolean flag = dfs(1, nums, left, right);
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

