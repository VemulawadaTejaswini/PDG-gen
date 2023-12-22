import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			long[] array = new long[n];
			for (int i=0; i<n; i++) array[i] = sc.nextLong();
			int times = sc.nextInt();  //queryの数
			for (int i=0; i<times; i++) {
				int query = sc.nextInt();  //命令：0 min 1 max
				int start = sc.nextInt();
				int end = sc.nextInt();
				switch (query) {
				//min(start,end)
				case 0:
					long min = array[start];
					for (int j=start+1; j<end; j++) {
						min = Math.min(min, array[j]);
					}
					System.out.println(min);
					break;
				//max(start,end)
				case 1:
					long max = array[start];
					for (int j=start+1; j<end; j++) {
						max = Math.max(max,array[j]);
					}
					System.out.println(max);
					break;

				}
			}
		}
	}
}
