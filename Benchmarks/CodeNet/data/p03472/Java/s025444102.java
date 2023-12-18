import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int swordNum = sc.nextInt();
		int hitPoint = sc.nextInt();

		int swordMaxPoint = 0;
		int swordPoint;
		int[] throwPoints = new int[swordNum];
		for(int i = 0; i < swordNum; i++) {
			swordPoint = sc.nextInt();
			swordMaxPoint = swordMaxPoint > swordPoint ? swordMaxPoint : swordPoint;
			throwPoints[i] = sc.nextInt();
		}
		Arrays.sort(throwPoints);
		int ans = 0;
		for(int i = swordNum-1; i >= 0; i--) {
			if(throwPoints[i] <= swordMaxPoint) {
				ans += Math.ceil((double)hitPoint / swordMaxPoint);
				hitPoint = 0;
				break;
			}
			hitPoint -= throwPoints[i];
			ans++;
			if(hitPoint <= 0) break;
		}
		if(hitPoint > 0) ans += Math.ceil((double)hitPoint / swordMaxPoint);

		System.out.println(ans);
	}
}
