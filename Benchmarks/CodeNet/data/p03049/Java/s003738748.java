import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int cnt = 0;
        int endCnt = 0;
        int startCnt = 0;
        int doubleCnt = 0;

        for (int i = 0; i < n; i++) {
        	String s = input.next();
        	if (s.startsWith("B")) {
        		startCnt++;
        	}
        	if (s.endsWith("A")) {
        		endCnt++;
        	}
        	if (s.startsWith("B") && s.endsWith("A")) {
        		doubleCnt++;
        	}
        	int index = s.indexOf("AB");
        	while (index != -1) {
        		cnt++;
        		index = s.indexOf("AB", index + 1);
        	}
        }

        int combiCnt = Math.min(startCnt, endCnt);

        if (startCnt == endCnt && doubleCnt == endCnt) {
        	combiCnt = combiCnt - 1;
        }

        int ans = cnt + combiCnt;

        System.out.println(ans);
    }
}
