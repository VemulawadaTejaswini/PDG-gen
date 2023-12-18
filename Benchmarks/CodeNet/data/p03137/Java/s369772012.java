import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pieceNum = sc.nextInt();
		int goalNum = sc.nextInt();
		int[] nums = new int[goalNum];
        for(int i = 0; i < goalNum; i++)nums[i] = sc.nextInt();
        Arrays.sort(nums);
        List<Integer> diffs = new ArrayList<>();
        for(int i = 0; i < goalNum-1; i++)diffs.add(Math.abs(nums[i+1]-nums[i]));

        int ans = 0;
        int max = 200000;
        for(int i = 0; i < goalNum - pieceNum; i++){
            int min = max;
            for(int j : diffs)if(j < min)min = j;
            
            ans += min;
            int minIndex = diffs.indexOf(min);
            diffs.set(minIndex, max);
        }

		System.out.println(ans);
	}
}