import java.util.Scanner;

class Main{

	static	int count = 0;
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] l = new int[N];		
		int[] r = new int[N];		

		int ans = 0;
			for(int i = 0;i < N;i++){
				l[i] = scanner.nextInt();
				r[i] = scanner.nextInt();
				
			}
			
			for(int i= 0;i < N;i++){
				ans += r[i] -l[i]+1;
			}
		
			
			System.out.println(ans);
		


	}

}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


