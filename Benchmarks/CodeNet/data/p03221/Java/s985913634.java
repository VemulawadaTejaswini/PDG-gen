public class main {

	static int N,M;
	static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		
		for(int i=0;i<M;i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			arr[P-1]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				String id1 = String.format("%06d", i+1);
				String id2 = String.format("%06d", j+1);
				System.out.println(id1+id2);
			}
		}
	}

}
