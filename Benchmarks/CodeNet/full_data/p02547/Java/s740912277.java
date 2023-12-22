
import java.io.*;
import java.util.*;

public class codeforces {

    static int[] subarrayWithMaxSum(int[] nums)
    {
        int endIndex = 0, currMax = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; ++i)
        {
            currMax = Math.max(nums[i],
                    nums[i] + currMax);
            if (currMax > globalMax)
            {
                globalMax = currMax;
                endIndex = i;
            }
        }

        int startIndex = endIndex;
        while (startIndex >= 0)
        {
            globalMax -= nums[startIndex];

            if (globalMax == 0)
                break;
            startIndex--;
        }
        int s = 0;
        for(int i = startIndex ; i <= endIndex ; i++) {
            s += nums[i];
        }
        return new int[]{startIndex , endIndex , s};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        int n = Integer.parseInt(br.readLine());
        int res = 0;
        boolean found = false;
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals(st.nextToken())) {
                res++;
            }
            else {
                res = 0;
            }
            if(res == 3) {
                found = true;
            }
        }
        if(found) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}