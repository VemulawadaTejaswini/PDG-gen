import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] flowerInfo = new int[n+1];
		for(int i=1;i <= n;i++) {
			flowerInfo[i] = sc.nextInt();
		}
		int answer = 0;
		while(!isEnd(flowerInfo)) {
			for(int i =1;i < flowerInfo.length;i++) {
				if(flowerInfo[i] != 0) {
					int left = i;
					int right = i;
					int mizuyari = 0;
					for(int j = left;j < flowerInfo.length;j++) {
						if(flowerInfo[left] > flowerInfo[j]) {
							right = j-1;
							mizuyari = flowerInfo[left] - flowerInfo[j];
							break;
						}
						if(j == n) {
							right = j;
							mizuyari = flowerInfo[left];
						}
					}
					for(int k = left;k <=right;k++) {
						flowerInfo[k] -= mizuyari;
					}
					answer += mizuyari;
					break;
				}
			}
		}
		System.out.println(answer);
	}

	private static boolean isEnd(int[] flowerInfo) {
		boolean endFlg = true;
		for(int i =1;i < flowerInfo.length;i++) {
			if(flowerInfo[i] != 0) {
				return false;
			}
		}
		return true;
	}
}