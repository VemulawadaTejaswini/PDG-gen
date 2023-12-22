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
					boolean flag = true;
					while (flag) {
						if (money>=list[index]) {
							money-=list[index];
							kabu++;
						} else {
							flag=false;
						}
					}
				}
			} else if (index==N-1) {
				boolean flag = true;
				while (flag) {
					if (kabu!=0) {
						money+=list[index];
						kabu--;
					} else {
						flag = false;
					}
				}
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
					boolean flag = true;
					while (flag) {
						if (kabu!=0) {
							money+=list[index];
							kabu--;
						} else {
							flag = false;
						}
					}
				} else if (!before&&after) {
					boolean flag = true;
					while (flag) {
						if (money>=list[index]) {
							money-=list[index];
							kabu++;
						} else {
							flag=false;
						}
					}
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
