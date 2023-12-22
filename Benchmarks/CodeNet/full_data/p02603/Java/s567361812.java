class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int N = sc.nextInt();
		int[] list = new int [N];

		for (int index=0; index<N; index++) {
			list[index]=sc.nextInt();
		}

		long money = 1000;
		long kabu = 0;

		for (int index=0; index<N; index++) {
			if (index==0) {
				if (list[index]<list[index+1]) {
					long kosuu = money/list[index];
					money-=kosuu*list[index];
					kabu+=kosuu;
				}
			} else if (index==N-1) {
				money+=kabu*list[index];
				kabu=0;
			} else {
				boolean before=true;
				boolean after=true;

				if (list[index-1]>list[index]) {
					before = false;
				}
				if (list[index]>list[index+1]) {
					after = false;
				}

				if (before&&!after) {
					money+=kabu*list[index];
					kabu=0;
				} else if (!before&&after) {
					long kosuu = money/list[index];
					money-=kosuu*list[index];
					kabu+=kosuu;
				}
			}
		}

		if (money<1000) {
			money = 1000;
		}

		System.out.println(money);

		sc.close();;

	}

}
