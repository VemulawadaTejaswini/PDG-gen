import java.util.Arrays;

class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();
		int[] placeList = new int[N];
		for (int index=0; index<N; index++) {
			placeList[index]=sc.nextInt();
		}
		long[] scoreList = new long[N];
		for (int index=0; index<N; index++) {
			scoreList[index]=sc.nextLong();
		}
		long maxScore = 0;
		long nowScore = 0;
		int nowPlace = 0;

		long [] answer = new long[N];
		boolean flag = true;
		boolean flag2 = true;

		for (int index=1; index<N+1; index++) {
			nowPlace = index;
			for (long index2=0; index2<K; index2++) {
				nowPlace=placeList[nowPlace-1];
				nowScore += scoreList[nowPlace-1];
				if (nowScore>maxScore) {
					maxScore = nowScore;
					flag = false;
					flag2 = false;
				}
			}
			answer[index-1]=maxScore;
			if (flag) {
				answer[index-1]=-9223372036854775808l;
			}
			nowScore = 0;
			maxScore = 0;
			flag = true;
		}

		if (flag2) {
			Arrays.sort(scoreList);
			answer[0]=scoreList[N-1];
		}
		Arrays.sort(answer);

		System.out.println(answer[N-1]);

		sc.close();
	}
}