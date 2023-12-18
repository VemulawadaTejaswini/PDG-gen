import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] data = new int[N];
		int ans = 0;
		boolean flag = true;
		for(int i = 0;i < data.length;i++){
			data[i] = scanner.nextInt();

			if(data[i] % 2 == 1){
				System.out.println(0);
				return;
			}
		}



		while(true){
			for(int i = 0;i < data.length;i++){
				if(data[i] % 2 == 1){
					System.out.println(ans);
					return;
				}
				data[i] /= 2;


			}
			ans++;

		}



	}


}

class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

