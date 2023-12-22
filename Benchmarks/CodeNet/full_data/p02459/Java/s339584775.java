public class Main {
		public static void main(String[] args) {

			Map<String, Integer> sales = new HashMap<>();
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			System.out.println("n="+ n);

			for(int i=0;i < n;i++){
				String key = sc.toString();
				int x = sc.nextInt();
				sales.put(key,x);
			}

			/*sales.put("tom", 10);
			sales.put("bob", 20);
			sales.put("steve", 30);
			*/

			for (Map.Entry<String, Integer> sale : sales.entrySet()) {
				System.out.println(sale.getKey() + ":" + sale.getValue());
			}

			for (Map.Entry<String, Integer> sale : sales.entrySet()) {
				System.out.println(sale.getKey() + ":" + sale.getValue());
			}
		}
	}
