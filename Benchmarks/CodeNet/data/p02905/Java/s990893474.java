import java.util.Scanner;

public class acorder381 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] numList = new int[n];

		while(in.hasNext()){
			for(int i = 1; i< n;i++) {
			numList[i] = in.nextInt();
			}
		}

        int count = numList.length;
        int num = 0;
        int sum = 0;

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                num++;
                sum += lcm(numList[i],numList[j]);
            }
        }
        System.out.println(sum);
    }

	private static long lcm(int m, int n) {
	    return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}

}
