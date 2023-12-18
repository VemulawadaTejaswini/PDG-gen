import java.util.Scanner;

class Main{
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		int ans =0 ;
		for(int i = 0;i < N.length();i++){
			if(N.substring(i, i+1).equals("1")){
				ans++;
			}
		}
		System.out.println(ans);



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

