public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int[] array = new int[1000001];
		
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.gc();
			int[] array = new int[N];
			
			
			//Arrays.fill(array, Integer.MAX_VALUE);
			for(int i = 0; i < N; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			int prev = array[0];
			int count = 1;
			boolean flag = false;;
			for(int i = 1; i < N; i++){
				if(prev == array[i]){
					count++;
				}else{
					if(count > N / 2){
						System.out.println(prev);
						flag = true;
						break;
					}
					
					prev = array[i];
					count = 1;
				}
			}
			
			if(count > 0){
				if(count > N / 2){
					System.out.println(prev);
					flag = true;
				}
			}
			
			if(!flag){
				System.out.println("NO COLOR");
			}
			
		}

	}

}