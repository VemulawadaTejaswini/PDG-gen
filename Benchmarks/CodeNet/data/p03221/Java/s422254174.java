public static long[] city;
	public static int M;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] str1 = str.split(" ");
		M = Integer.parseInt(str1[1]);
		city = new long[M];
		String strCity[] = new String[M];
		long oldzhouyear[] = new long[M];
		long zhou = 0;
		long year = 0;
		for (int i = 0; i < M; i++) {
			str = bf.readLine();
			str1 = str.split(" ");
			zhou = Long.parseLong(str1[0]);
			year = Long.parseLong(str1[1]);
			oldzhouyear[i] = zhou * 10000000000l + year;
			city[i] = zhou * 10000000000l + year;
		}
		Arrays.sort(city);
		int a = (int) (city[0] / 10000000000l);
		int c = 0;
		int ind = 1;
		strCity[0] = intToStr(a) + intToStr(ind);
		for (int i = 1; i < M; i++) {
			c = (int) (city[i] / 10000000000l);
			if (c == a) {
				++ind;
				strCity[i] = intToStr(c) + intToStr(ind);
				a = c;
			} else {
				ind = 1;
				strCity[i] = intToStr(c) + intToStr(ind);
				a = c;
			}

		}
		for (int i = 0; i < M; i++) {
			ind = getIndex(oldzhouyear[i]);
			System.out.println(strCity[ind]);
		}

	}

	public static String intToStr(int a) {
		String res = "000000" + String.valueOf(a);
		return res.substring(res.length() - 6, res.length());
	}

	public static int getIndex(long num) {
		int left = 0, right = M - 1;
		if (city[left] == num) {
			return left;
		} else if (city[right] == num) {
			return right;
		}
		int mid = (left + right) / 2;
		while (num != city[mid]) {
			if (num <= city[mid]) {
				right = mid;
			} else {
				left = mid;
			}
			mid = (left + right) / 2;
		}
		return mid;
	}
