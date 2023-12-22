class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			HashMap<String, Integer> data = new HashMap<String, Integer>();
			int items = sc.nextInt();
			if (items == 0) {
				break;
			}
			for (int i = 0; i < items; i++) {
				data.put(sc.next(), sc.nextInt());
			}
			int craftrecipe = sc.nextInt();
			for (int j = 0; j < craftrecipe; j++) {
				String item = sc.next();
				int source = sc.nextInt();
				int money = 0;
				for (int k = 0; k < source; k++) {
					String a = sc.next();
					money += data.get(a);
				}
				if (data.get(item) > money) {
					data.put(item, money);
				}
			}
			String answer = sc.next();
			System.out.println(data.get(answer));
		}
	}
}