import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
        long K = input.nextLong();

        long ans1 = 0;
        long ans2 = 0;
        int beki = 0;
        int cnt = 1;
        int zyousan = 1;

        for(int i = 1; i <= K; i++,cnt++){


        	if(cnt == 10){
        		ans2 = ans1;
        		beki += 1;
        		cnt = 1;
        		zyousan = pow(10, beki);
        	}

        	ans1 = cnt * zyousan;
        	ans1 += ans2;

        	System.out.println(ans1);
        }

	}

	public static int pow(int x, int y) {
	    return (new Double(Math.pow((double) x, (double) y))).intValue();
	  }

}