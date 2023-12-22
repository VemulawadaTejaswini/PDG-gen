import java.util.Scanner;

public class Main {
	public static void initiallize(boolean b[]) {
		for (int i = 0; i < b.length; ++i) {
			b[i] = false;
		}
	}

	public static int same(int num[]) {
		int count = 0;
		for (int i = 0; i < num.length; ++i) {
			if (num[i] != 0) {
				for (int j = i + 1; j < num.length - 1; ++j) {
					if (num[i] == num[j]) {
						int tmp = research(num, num[i]);
						if (tmp != j) {
							num[j] = 0;
							num[tmp] = 0;
							++count;
							num[i] = 0;
							break;
						}
					}
				}
			}
		}
		return count;
	}

	public static int continuous(int num[]) {
		int count = 0;
		for (int i = 0; i < num.length; ++i) {
			if (num[i] != 0) {
				for (int j = i + 1; j < num.length - 1; ++j) {
					if (num[i] - 1 == num[j]) {
						int tmp = research(num, num[i] - 2);
						if (tmp != -1) {
							if (tmp != j) {
								num[j] = 0;
								num[tmp] = 0;
								++count;
								num[i] = 0;
								break;
							}
						} else {
							tmp = research(num, num[i] + 1);
							if (tmp != -1) {
								if (tmp != j) {
									num[j] = 0;
									num[tmp] = 0;
									num[i] = 0;
									++count;
									break;
								}
							}
						}
					} else if (num[i] - 2 == num[j]) {
						int tmp = research(num, num[i] - 1);
						if (tmp != -1) {
							if (tmp != j) {
								num[j] = 0;
								num[tmp] = 0;
								num[i] = 0;
								++count;
								break;
							}
						}
					} else if (num[i] + 2 == num[j]) {
						int tmp = research(num, num[i] + 1);
						if (tmp != -1) {
							if (tmp != j) {
								num[j] = 0;
								num[tmp] = 0;
								num[i] = 0;
								++count;
								break;
							}
						}
					} else if (num[i] + 1 == num[j]) {
						int tmp = research(num, num[i] - 1);
						if (tmp != -1) {
							if (tmp != j) {
								num[j] = 0;
								num[tmp] = 0;
								++count;
								num[i] = 0;
								break;
							}
						} else {
							tmp = research(num, num[i] + 2);
							if (tmp != -1) {
								if (tmp != j) {
									num[j] = 0;
									num[tmp] = 0;
									num[i] = 0;
									++count;
									break;
								}
							}
						}
					}
				}
			}
		}
		return count;
	}

	public static int research(int num[], int k) {
		for (int i = num.length - 1; i >= 0; --i) {
			if (num[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static int judge(int num[], boolean b[]) {
		int count = 0;
		int j = 0;
		int number[] = new int[9];
		for (int i = 0; i < num.length; ++i) {
			if (b[i] == true) {
				number[j] = num[i];
				++j;
			}
		}
		if (number[2] == 0)
			return -1;
		// same three number
		count += same(number);
		// continuous three number
		count += continuous(number);

		return count;

	}

	public static void main(String[] args) {
		int T, num[];
		boolean R[], G[], B[];// position of R,B,G
		int count;
		String str[];
		num = new int[9];
		str = new String[9];
		R = new boolean[9];
		B = new boolean[9];
		G = new boolean[9];
		int i, j;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (i = 0; i < T * 2; ++i) {
			for (j = 0; j < 9; ++j) {
				if (i % 2 == 0) {
					num[j] = sc.nextInt();
				} else {
					str[j] = sc.next();
					if (str[j].equals("R")) {
						R[j] = true;
					} else if (str[j].equals("B")) {
						B[j] = true;
					} else {
						G[j] = true;
					}
				}
			}

			if (i % 2 == 1) {
				count = 0;
				// Rのときに条件を満たすものを探す
				int tmp = judge(num, R);
				if (tmp != -1) {
					count += tmp;
				}
				// B
				tmp = judge(num, B);
				if (tmp != -1) {
					count += tmp;
				}
				// G
				tmp = judge(num, G);
				if (tmp != -1) {
					count += tmp;
				}
				if (count == 3) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				initiallize(R);
				initiallize(B);
				initiallize(G);
			}
		}
		sc.close();
	}

}

