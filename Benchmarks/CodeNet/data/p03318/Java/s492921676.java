import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
        long K = input.nextLong();

        long ans1 = 0;
        long ans2 = 0;
        long answer = 0;
        int beki = 0;
        int cnt = 1;
        long zyousan = 1;
        long answer2 = 0;
        long zyousan2 = 0;

        for(int i = 0; i < K; i++,cnt++){


        	if(cnt >= 10){
        		beki += 1;
        		cnt = 1;
        		zyousan = pow(10, beki);


        		if(beki >= 3){
        			answer2 = answer;
    				//ans1 = cnt * zyousan;
    				zyousan2 = pow(10, beki-1);
        			for(int j = 1; j <= 9*(beki-2) && i <= K; j++){
        				answer2 += zyousan2;

        				System.out.println(answer2);
        				K--;
        			}
        		}
        		ans2 = answer;
        		//System.out.println(" "+ans2);
        	}

        	ans1 = cnt * zyousan;
        	answer = ans1 + ans2;

        	if(answer > answer2 && i <= K){
        	System.out.println(answer);
        	}else if(i < K){
        		//K++;
        		System.out.println(answer2 += zyousan2);
        	}
        }

	}

	public static long pow(int x, int y) {
	    return (new Double(Math.pow((double) x, (double) y))).longValue();
	  }

}