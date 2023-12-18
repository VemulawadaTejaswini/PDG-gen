public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int[] prime = {2,3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		List<Integer> beki = new ArrayList<Integer>();
		beki.add(1);

		for(int i = 0;i<prime.length;i++){
			int now = (int)Math.pow(prime[i], 2);
			int p = 2;
			while(now <= X){
				now = (int)Math.pow(prime[i], p);
				beki.add(now);
				p++;

			}
		}

		beki.sort(null);
		System.out.println(beki.get(beki.size()-1));

	}


}