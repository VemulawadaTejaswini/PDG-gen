import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int swordNum = sc.nextInt();
		int hitPoint = sc.nextInt();
		int[] swordPoints = new int[swordNum];
		int[] throwPoints = new int[swordNum];
		for(int i = 0; i < swordNum; i++) {
			swordPoints[i] = sc.nextInt();
			throwPoints[i] = sc.nextInt();
		}
		int ans = 0;
		boolean[] thrown = new boolean[swordNum + 1];
		Arrays.fill(thrown, 0, swordNum, false);
		
		int useSword = swordNum;
		int[] attack = new int[swordNum+1];
		while(hitPoint > 0) {
			Arrays.fill(attack, 0, swordNum, -1);
			useSword = swordNum;
			for(int i = 0; i < swordNum; i++) {
				attack[i] = thrown[i] ? swordPoints[i] : throwPoints[i];
				if(attack[i] > attack[useSword]) useSword = i;
			}
			hitPoint -= attack[useSword];
			thrown[useSword] = true;
			ans++;
		}

		System.out.println(ans);
	}
}


class Calc {
	static int min(int[] nums) {
		int ans = nums[0];
		int len = nums.length;
		for(int i = 1; i < len; i++) {
			ans = Math.min(ans, nums[i]);
		}
		return ans;
	}
}