import java.util.Scanner;

public class Main {
	
	static int r;
	static int s;
	static int p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nkArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(nkArr[0]);
		int k = Integer.parseInt(nkArr[1]);
		String[] rspArr = sc.nextLine().split(" ");
		r = Integer.parseInt(rspArr[0]);
		s = Integer.parseInt(rspArr[1]);
		p = Integer.parseInt(rspArr[2]);
		
		long ans = 0;
		
		String[] gameStrategyList = sc.nextLine().split("");
		
		sc.close();
		
		for(int i = 0; i < k; i++) {
			String beforeStrategy = gameStrategyList[i];
			ans += getPoint(beforeStrategy);
			for(int j = i+k; j < gameStrategyList.length; j=j+k) {
				if(gameStrategyList[j].equals(beforeStrategy)) {
					beforeStrategy = "";
				}else {
					beforeStrategy = gameStrategyList[j];
					ans += getPoint(beforeStrategy);
				}
			}
		}
		
		System.out.println(ans);
	}
	
	static int getPoint(String str) {
		switch(str) {
			case "r":
				return p;
			case "s":
				return r;
			case "p":
				return s;
			default:
				return 0;
		}
	}
	
}
