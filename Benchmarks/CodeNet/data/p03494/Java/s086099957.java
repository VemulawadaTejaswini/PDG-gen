	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt(), c = 0, s = 0;
		for(int i = 0; i < n; i++) {
			int e = sc.nextInt();
			list.add(e);
		}
		int j;
		for(j = 0; j < list.size(); j++) {
			if(list.get(j) % 2 == 0) c++;
			if(c == list.size()) {
				for(int i = 0; i < list.size();i++) {
					list.set(i, list.get(i) / 2);
					j = -1; c = 0;
				}
				s++;
			}
		}
		System.out.println(s);
		sc.close();
	}